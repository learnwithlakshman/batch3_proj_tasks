package com.lwl.course.service;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.lwl.course.domain.Student;
import com.lwl.course.dto.PlacementCountDTO;
import com.lwl.course.dto.StudentDTO;
import com.lwl.course.util.CsvReaderUtil;

public class StudentServiceImpl implements StudentService {

	private List<Student> studentList;
	
	private String fileName;
	
	public StudentServiceImpl(String fileName) {
	
			studentList = CsvReaderUtil.getStudents(fileName);
		
	}
	
	
	@Override
	public List<Student> getStudentByQualification(String qualification) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCountBy(Predicate<Student> predicate) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PlacementCountDTO getPlacedAndNotPlacedCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> search(String str) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float successRateOfGivenBatch(String batchName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Student> maxScoreStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getAllNames() {
		return studentList.stream().map(Student::getName).collect(Collectors.toList());
	}

	@Override
	public List<StudentDTO> getAllStudentDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
