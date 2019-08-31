package com.techlabs.organization.employee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HierarchyGenerator {
	private HashSet<Employee> employees;
	private Employee rootEmployee;
	public HierarchyGenerator(HashSet<Employee> employees) {
		this.employees = employees;
	}
	
	public void organize() {
		for (Employee employee : employees) {
			parseSubordinates(employee);
		}
	}
	public void parseSubordinates(Employee parentEmp) {
		for (Employee employee : employees) {
			try {
				if(employee.getManagerId()==parentEmp.getId()) {
					parentEmp.getSubordinates().add(employee);
				}
			}catch(NullPointerException e) {}
			
		}
	}
}
