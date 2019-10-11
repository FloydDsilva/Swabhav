package com.techlabs.model;

import java.io.Serializable;

public class Contact implements Serializable{
	private final String firstName;
	private final String lastName;
	private final String email;
	private final String contact;
	
	public Contact(String firstName, String lastName, String email, String contact) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contact = contact;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getContact() {
		return contact;
	}
	
	@Override
	public String toString() {
		return "Name:"+firstName+" "+lastName+" Email:"+email+" Contact:"+contact;
	}
}
