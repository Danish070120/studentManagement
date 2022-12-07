package com.example.service;

import java.util.List;

import com.example.entity.Student;

public interface StudentService {

	Student saveStudent(Student student);

	List<Student> fetchStudentList();

	Student updateStudent(Student student, Integer id);

}
