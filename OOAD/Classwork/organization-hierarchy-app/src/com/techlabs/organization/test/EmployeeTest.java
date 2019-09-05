package com.techlabs.organization.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import com.techlabs.organization.employee.Employee;
import com.techlabs.organization.employee.EmployeeSetAnalyzer;
import com.techlabs.organization.employee.HierarchyGenerator;
import com.techlabs.organization.loaders.EmployeeFileDataLoader;
import com.techlabs.organization.loaders.EmployeeURLDataLoader;


public class EmployeeTest {

	public static void main(String[] args) {
		EmployeeSetAnalyzer analyserF=new EmployeeSetAnalyzer(new EmployeeFileDataLoader("resources\\dataFile.txt"));
		HashSet<Employee> employees=analyserF.getEmployees();
		displayEmp(employees);
		System.out.println("Max Salaried Employee:"+analyserF.getHighestSalEmp());
		System.out.println("Designation Distribution");
		Map<String, Integer> desgnMap=analyserF.getDesignationDistribution();
		displayDesgnMap(desgnMap);
		System.out.println("Department Distribution");
		Map<Integer, Integer> deptMap=analyserF.getDepartmentDistribution();
		displayDeptMap(deptMap);
		
		System.out.println();
		EmployeeSetAnalyzer analyserO=new EmployeeSetAnalyzer(new EmployeeURLDataLoader("https://swabhav-tech.firebaseapp.com/emp.txt"));
		HashSet<Employee> employeesO=analyserO.getEmployees();
		displayEmp(employeesO);
		System.out.println("Max Salaried Employee:"+analyserO.getHighestSalEmp());
		System.out.println("Designation Distribution");
		Map<String, Integer> desgnMapO=analyserO.getDesignationDistribution();
		displayDesgnMap(desgnMapO);
		System.out.println("Department Distribution");
		Map<Integer, Integer> deptMapO=analyserO.getDepartmentDistribution();
		displayDeptMap(deptMapO);
		
		//7901,"FLOYD','DEVELOPER',NULL,'1-JUN-92',1000,NULL,40
		HierarchyGenerator h=new HierarchyGenerator(employees);
		h.organize();
		displaySubordinates(employees);
		
		System.out.println(h.getRootEmployee()+"\n");
		
		h.traversal(h.getRootEmployee());
		
		
		
	}

	private static void displaySubordinates(HashSet<Employee> employees) {
		for (Employee employee : employees) {
			System.out.println(employee);
			System.out.println("Subordinates:");
			for (Employee subordinate : employee.getSubordinates()) {
				System.out.println(subordinate.getDesignation());
			}
		}
	}

	private static void displayDesgnMap(Map<String, Integer> frequencyMap) {
		for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
			System.out.println("\t"+entry.getKey() + ": " + entry.getValue());
		}
	}

	private static void displayDeptMap(Map<Integer, Integer> frequencyMap) {
		for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
			System.out.println("\t "+entry.getKey() + ": " + entry.getValue());
		}
	}
	
	private static void displayEmp(HashSet<Employee> employees) {
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		System.out.println("size:"+employees.size());
	}

}
