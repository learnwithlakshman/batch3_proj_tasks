package projecttasks;

import java.util.List;
import java.util.function.Predicate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lwl.course.domain.Status;
import com.lwl.course.domain.Student;
import com.lwl.course.service.StudentService;
import com.lwl.course.service.StudentServiceImpl;

public class StudentServiceTest {

	String fileName = "coursedata.csv";

	@Test
	public void getStudentNamesTest() {
		StudentService service = new StudentServiceImpl(fileName);
		List<String> list = service.getAllNames();
		Assertions.assertNotNull(list, "Student names can't be empty or null");
		Assertions.assertTrue(list.size() == 10);
	}

	@Test
	void getMaxScoreStudents() {
		StudentService service = new StudentServiceImpl(fileName);
		List<Student> list = service.maxScoreStudents();
		System.out.println(list);
		Assertions.assertTrue(list.size() == 1);
		Assertions.assertEquals(list.get(0).getName(), "WILLIAMS");

	}

	@Test
	void getStudentByQualificationTest() {
		StudentService service = new StudentServiceImpl(fileName);
		String qualification = "BE";
		List<Student> list = service.getStudentByQualification(qualification);
		Assertions.assertEquals(10, list.size());
	}
	
	@Test
	void getStudentByQualificationWhichIsNotValidTest() {
		StudentService service = new StudentServiceImpl(fileName);
		String qualification = "MBBS";
		List<Student> list = service.getStudentByQualification(qualification);
		Assertions.assertEquals(0, list.size());
	}

	@Test
	void getStudentDetailsWhoseScoreIsMoreThan80() {
		Predicate<Student> p = (s) -> s.getScore() > 70;
		StudentService service = new StudentServiceImpl(fileName);
		int count = service.getCountBy(p);
		Assertions.assertEquals(2, count);
	}
	
	@Test
	void getStudentDetailsQuaificationAndPlacementStatus() {
		Predicate<Student> p = (s) -> s.getPlacementStatus().equals(Status.Y) && s.getQualification().equalsIgnoreCase("BE");
		StudentService service = new StudentServiceImpl(fileName);
		int count = service.getCountBy(p);
		Assertions.assertEquals(4, count);
	}
}
