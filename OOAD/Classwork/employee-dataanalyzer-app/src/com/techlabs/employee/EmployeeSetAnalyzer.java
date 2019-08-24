package com.techlabs.employee;

import java.util.HashSet;

public class EmployeeSetAnalyzer {
	private HashSet<Employee> employees =new HashSet<Employee>();
	
	public void setEmployees(HashSet<Employee> employees) {
		this.employees = employees;
	}

	
	public HashSet<Employee> getEmployees() {
		return employees;
	}
	
}
