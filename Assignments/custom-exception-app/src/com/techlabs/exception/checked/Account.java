package com.techlabs.exception.checked;

import java.util.ArrayList;

public class Account {
	public static ArrayList<Integer> uniqueID=new ArrayList<Integer>();
	private final int id;
	private final String name;
	public Account(int id, String name) throws IdNotUniqueException {
		this.id = id;
		this.name = name;
		if(validateId(id)) {
			uniqueID.add(id);
		}
	}
	public boolean validateId(int id) throws IdNotUniqueException{
		if(uniqueID.contains(id)) {
			throw new IdNotUniqueException("Account Id is not Unique!");
		}
		else {
			return true;
		}
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public static ArrayList<Integer> getUniqueID() {
		return uniqueID;
	}
	
}
