package com.techlabs.comparable.test;

import java.util.ArrayList;
import java.util.Collections;

import com.techlabs.comparable.Student;

public class StudentTest {
	public static void main(String[] args) {
		ArrayList<Student> students=new ArrayList<Student>();
		students.add(new Student(1, "sachin", 30));
		students.add(new Student(2, "Virat", 40));
		students.add(new Student(3, "Yuvraj", 35));
		students.add(new Student(4, "Kapil", 23));
		students.add(new Student(4, "Hardik", 19));
		System.out.println(students);
		System.out.println("\nSort Age:");
		Collections.sort(students);
		System.out.println(students);
		System.out.println("\nStudents:");
		System.out.println(students);
	}
}
