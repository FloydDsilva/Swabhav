package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Student;

public class StudentService {
	
	Student student=new Student();
	Student student2=new Student();
	Student student3=new Student();
	List<Student> students=new ArrayList<Student>();
	
	private static StudentService instance=new StudentService();
	private StudentService() {
		System.out.println("In Student service");
		populateArray();
		students.add(student);
		students.add(student2);
		students.add(student3);
	}
	
	public static StudentService getInstance() {
		return instance;
	}
	public void addStudent(Student studentNew) {
		students.add(studentNew);
	}
	private void populateArray(){
		student.setId(1);
		student.setName("Sachin");
		student.setRollNo(1);
		student.setAge(20);
		
		student2.setId(2);
		student2.setName("Virat");
		student2.setRollNo(2);
		student2.setAge(22);
		
		student3.setId(3);
		student3.setName("Yuvraj");
		student3.setRollNo(3);
		student3.setAge(24);
	}
	
	public List<Student> getStudents() {
		return students;
	}

}
