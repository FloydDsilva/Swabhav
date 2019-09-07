package com.techlabs.organization.employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HierarchyGenerator {
	private HashSet<Employee> employees;
	private Employee rootEmployee=null;
	private int level=0;
	private StringBuilder sb;
	public HierarchyGenerator(HashSet<Employee> employees) {
		this.employees = employees;
		sb=new StringBuilder();
	}
	
	public void organize() {
//		for (Employee employee : employees) {
//			parseSubordinates(employee);
//		}
		Map<Integer,Employee> empMap=new HashMap<Integer, Employee>();
		for (Employee employee : employees) {
			empMap.put(employee.getId(), employee);
		}
		for(Entry<Integer, Employee> entry:empMap.entrySet()) {
			try {
			empMap.get(entry.getValue().getManagerId()).getSubordinates().add(entry.getValue());}
			catch (NullPointerException e) {
			}
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
		sb.append("<employee id=\""+employee.getId()+"\">"+"<details>"+employee+"</details>");	
		System.out.println(getSpacing(level)+employee+"\t"+level);
		sb.append("<subordinate>");
		for(Employee subordinate:employee.getSubordinates()) {
			level+=1;
			traversal(subordinate);
			level-=1;
		}
		sb.append("</subordinate>");
		sb.append("</employee>");
	}
	
	private String getSpacing(int level) {
		String tabs="";
		for(int i=0;i<level;i++) {
			tabs+="\t";
		}
		return tabs;
	}
	
	public StringBuilder getSB() {
		return sb;
	}
}
