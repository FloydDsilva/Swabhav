package com.techlabs.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.model.Student;
import com.techlabs.repository.StudentRepository;
@Service("studSvc")
public class StudentService {
	@Autowired
	private StudentRepository repository;
	
	public StudentService() {
		System.out.println("student service constructor");
	}
	
	public List<Student> getStudents() {
		return repository.getStudents();
	}

	public void addStudent(String name, int age, int rollNo) {
		repository.addStudent(name,age,rollNo);
		
	}

	public void deleteStudent(String id) {
		repository.deleteStudent(id);
		
	}

	public Student fetchStudent(String uuid) {
		return repository.fetchStudent(uuid);
	}

	public void updateStudent(Student studentNew) {
		repository.updateStudent(studentNew);
	}

	
	
}
