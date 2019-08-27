package com.techlabs.employee.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import com.techlabs.employee.Employee;
import com.techlabs.employee.EmployeeFileDataLoader;
import com.techlabs.employee.EmployeeSetAnalyzer;
import com.techlabs.employee.EmployeeURLDataLoader;

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
		HashSet<Employee> employeesO=analyserF.getEmployees();
		displayEmp(employeesO);
		System.out.println("Max Salaried Employee:"+analyserO.getHighestSalEmp());
		System.out.println("Designation Distribution");
		Map<String, Integer> desgnMapO=analyserO.getDesignationDistribution();
		displayDesgnMap(desgnMapO);
		System.out.println("Department Distribution");
		Map<Integer, Integer> deptMapO=analyserO.getDepartmentDistribution();
		displayDeptMap(deptMapO);
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
