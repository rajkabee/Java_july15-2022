package com.dursikshya.springBootDemo.student;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {
	private final List<Student> STUDENTS = Arrays.asList(
				new Student(1, "Sanakar Dhital"),
				new Student(2, "Prabin Khadka"),
				new Student(3, "Sunil Maharjan")
			);
			
	
	
	@GetMapping(path="{studentId}")
	public Student getStudnet(@PathVariable("studentId") Integer studentId) {
		return STUDENTS.stream()
						.filter(student->studentId.equals(student.getStudentId()))
						.findFirst()
						.orElseThrow(()->new IllegalArgumentException("Student "+studentId+" does not exists."));
	}
}
