package com.techlabs.college;

public class Student extends Person {
	private final BranchCategory branch; 
	public Student(String id, String adress, String dob,BranchCategory branch) {
		super(id, adress, dob);
		this.branch=branch;
	}
	
	@Override
	public String getDetails() {
		
		return "Branch:"+branch;
	}
	
}
