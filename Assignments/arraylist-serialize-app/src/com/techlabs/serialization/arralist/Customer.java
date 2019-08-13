package com.techlabs.serialization.arralist;

import java.io.Serializable;

public class Customer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6971662044859116781L;
	private final String firstName;
	private final String lastName;
	private final int id;
	private static int counter;
	
	static {
		counter=1000;
	}
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		counter+=1;
		id=counter;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getId() {
		return id;
	}
	
	
}
