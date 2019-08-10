package com.techlabs.inheritance;

public class Employee {
	protected final int baseSalary;
	public Employee() {
		baseSalary=2000;
	}
	
	public String getInfo() {
		return "Employee";
	}
	public int getSalary() {
		return baseSalary;
	}
}
