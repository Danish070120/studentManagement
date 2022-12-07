package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;

	@PostMapping("/student")
	public Student insertStudent(@RequestBody Student student) {
		Student savedStudent = studentService.saveStudent(student);
		return savedStudent;
	}

	@GetMapping("/getstudent")
	public List<Student> fetchStudentList() {
		return studentService.fetchStudentList();
	}

	@PutMapping("/student/{id}")
	public Student updateStudent(@RequestBody Student student, @PathVariable("id") Integer id) {
		return studentService.updateStudent(student, id);
	}
}
