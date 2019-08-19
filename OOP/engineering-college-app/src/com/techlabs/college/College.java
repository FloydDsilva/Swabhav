package com.techlabs.college;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class College {
	private int countStudents;
	private int countProfessor;
	private final String collegeName;
	private ArrayList<Person> persons=new ArrayList<Person>();
	private ArrayList<Professor> professors=new ArrayList<Professor>();
	private ArrayList<Student> students=new ArrayList<Student>();
	
	public College(String collegeName) {
		this.collegeName=collegeName;
	}
	public void addPerson(Person person) {
		persons.add(person);
		if(person.getClass()==Student.class) {
			countStudents+=1;
			students.add((Student) person);
		}
		if(person.getClass()==Professor.class) {
			countProfessor+=1;
			professors.add((Professor) person);
		}
	}
	
	public String getCollegeName() {
		return collegeName;
	}
	
	public int getCountStudents() {
		return countStudents;
	}
	public int getCountProfessor() {
		return countProfessor;
	}
	
	public List<Student> getStudents() {
		List<Student> unchangeableStudents=Collections.unmodifiableList(students);
		return unchangeableStudents;
	}
	public Iterable<Professor> getProfessor() {
		//List<Professor> unchangeableProfessors=Collections.unmodifiableList(professors);
		//return unchangeableProfessors;
		return professors;
	}
	public List<Person> getAllPersons() {
		List<Person> unchangeablePerson=Collections.unmodifiableList(persons);
		return unchangeablePerson;
	}
}
