package com.techlabs.employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class EmployeeSetAnalyzer {
	private HashSet<Employee> employees =new HashSet<Employee>();
	
	
	public EmployeeSetAnalyzer(ILoadable<Employee> loader) {
		employees=loader.loadData();
	}

	public EmployeeSetAnalyzer(HashSet<Employee> employees) {
		this.employees = employees;
	}

	public void setEmployees(HashSet<Employee> employees) {
		this.employees = employees;
	}

	public Employee getHighestSalEmp() {
		int id=0;
		int max=0;
		for (Employee employee : employees) {
			if(employee.getSalary()>max) {
				max=employee.getSalary();
			}
		}
		for (Employee employee : employees) {
			if(employee.getSalary()==max) {
				return employee;
			}
		}
		return null;
	}
	
	public Map<String, Integer> getDesignationDistribution() {
		ArrayList<String> desgnList=new ArrayList<String>();
		for (Employee employee : employees) {
			desgnList.add(employee.getDesignation());
		}
		Map<String, Integer> frequencyMap = new HashMap<>();
		for (String s: desgnList) {
			Integer count = frequencyMap.get(s);
			if (count == null)
				count = 0;

			frequencyMap.put(s, count + 1);
		}
		return frequencyMap;
	}
	
	public Map<Integer, Integer> getDepartmentDistribution() {
		ArrayList<Integer> deptList=new ArrayList<Integer>();
		for (Employee employee : employees) {
			deptList.add(employee.getDeptNo());
		}
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		for (Integer deptNo: deptList) {
			Integer count = frequencyMap.get(deptNo);
			if (count == null)
				count = 0;

			frequencyMap.put(deptNo, count + 1);
		}
		return frequencyMap;
	}
	
	public HashSet<Employee> getEmployees() {
		return employees;
	}
	
}
