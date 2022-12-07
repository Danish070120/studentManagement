package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {
		studentRepository.save(student);
		return student;

	}

	@Override
	public List<Student> fetchStudentList() {
		return (List<Student>) studentRepository.findAll();
	}

}
