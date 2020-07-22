package projecttasks;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lwl.course.domain.Student;
import com.lwl.course.service.StudentService;
import com.lwl.course.service.StudentServiceImpl;

public class StudentServiceTest {
	
		String fileName = "coursedata.csv";

		@Test
		public void getStudentNamesTest() {
			StudentService service = new StudentServiceImpl(fileName);
			List<String> list = service.getAllNames();
			Assertions.assertNotNull(list,"Student names can't be empty or null");
			Assertions.assertTrue(list.size() == 10);
		}
		
		void getMaxScoreStudents() {
			StudentService service = new StudentServiceImpl(fileName);
			List<Student> list = service.maxScoreStudents();
		}
}
