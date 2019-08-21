package com.techlabs.comparable;

public class Student{
	private final int id;
	private final String name;
	private final int age;
	
	
	
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Id:"+id+" Name:"+name+" Age:"+age;
	}

	

}
