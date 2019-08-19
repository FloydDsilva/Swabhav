package com.techlabs.college.test;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.college.BranchCategory;
import com.techlabs.college.College;
import com.techlabs.college.Person;
import com.techlabs.college.Professor;
import com.techlabs.college.Student;

public class CollegeTest {

	public static void main(String[] args) {
		Student studentRam = new Student("1", "Mumbai", "1st Jan", BranchCategory.IT);
		showDetails(studentRam);
		Professor professorSachin = new Professor("1", "Thane", "1st Dec", 10000);
		showDetails(professorSachin);
		System.out.println();
		College sfit=new College("St. Francis Institute of Technology");
		sfit.addPerson(studentRam);
		sfit.addPerson(professorSachin);
		showCollegeDetails(sfit);
		System.out.println();
		Professor professorVirat = new Professor("2", "Thane", "2st Dec", 10000);
		sfit.addPerson(professorVirat);
		Professor professorJohn = new Professor("3", "Pune", "3st Dec", 10000);
		sfit.addPerson(professorJohn);
		showCollegeDetails(sfit);
		System.out.println();
		showCollegeStudents(sfit);
		System.out.println();
		showCollegeProfessors(sfit);
	}

	private static void showDetails(Person person) {
		System.out.println("Id:" + person.getId() + " Adress:" + person.getAdress() + " DOB:" + person.getDob() + " "
				+ person.getDetails());
	}

	private static void showCollegeDetails(College college) {
		System.out.println("College Name:"+college.getCollegeName());
		System.out.println("Total Students:"+college.getCountStudents()+" Total Professors:"+college.getCountProfessor());
		String details="";
		List<Person> persons=college.getAllPersons();
		for(Person person:persons) {
			details="Id:" + person.getId() + " Adress:" + person.getAdress() + " DOB:" + person.getDob() + " "
					+ person.getDetails();
			System.out.println(details);
		}
	}
	private static void showCollegeStudents(College college) {
		System.out.println("College Name:"+college.getCollegeName());
		System.out.println("Total Students:"+college.getCountStudents());
		System.out.println("Students:-");
		String details="";
		List<Student> students=college.getStudents();
		for(Person person:students) {
			details="Id:" + person.getId() + " Adress:" + person.getAdress() + " DOB:" + person.getDob() + " "
					+ person.getDetails();
			System.out.println(details);
		}
	}
	private static void showCollegeProfessors(College college) {
		System.out.println("College Name:"+college.getCollegeName());
		System.out.println("Total Professors:"+college.getCountProfessor());
		System.out.println("Professors:-");
		String details="";
		Iterable<Professor> persons=college.getProfessor();
		for(Person person:persons) {
			details="Id:" + person.getId() + " Adress:" + person.getAdress() + " DOB:" + person.getDob() + " "
					+ person.getDetails();
			System.out.println(details);
		}
	}
}
