package com.techlabs.college;

public abstract class Person {
	private final String id;
	private final String adress;
	private final String dob;
	public abstract String getDetails();
	public Person(String id, String adress, String dob) {
		this.id = id;
		this.adress = adress;
		this.dob = dob;
	}
	public String getId() {
		return id;
	}
	public String getAdress() {
		return adress;
	}
	public String getDob() {
		return dob;
	}
}
