package com.techlabs.organization.employee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HierarchyGenerator {
	private HashSet<Employee> employees;
	private Employee rootEmployee=null;
	private int level=0;
	public HierarchyGenerator(HashSet<Employee> employees) {
		this.employees = employees;
	}
	
	public void organize() {
		for (Employee employee : employees) {
			parseSubordinates(employee);
		}
	}
	private void parseSubordinates(Employee parentEmp) {
		for (Employee employee : employees) {
			try {
				if(employee.getManagerId()==parentEmp.getId()) {
					parentEmp.getSubordinates().add(employee);
				}
			}catch(NullPointerException e) {}
			
		}
	}

	public HashSet<Employee> getEmployees() {
		return employees;
	}

	public Employee getRootEmployee() {
		findRootEmployee();
		return rootEmployee;
	}
	
	private void findRootEmployee() {
		for (Employee employee : employees) {
			if(employee.getManagerId()==null) {
				rootEmployee= employee;
			}
		}
	}
	
	
	public void traversal(Employee employee) {
		
		if(employee==null) {
			return;
		}
			
		System.out.println(getSpacing(level)+employee+"\t"+level);
		for(Employee subordinate:employee.getSubordinates()) {
			level+=1;
			traversal(subordinate);
			level-=1;
		}
	}
	
	private String getSpacing(int level) {
		String tabs="";
		for(int i=0;i<level;i++) {
			tabs+="\t";
		}
		return tabs;
	}
}
