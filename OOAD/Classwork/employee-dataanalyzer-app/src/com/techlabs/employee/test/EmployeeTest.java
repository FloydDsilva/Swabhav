package com.techlabs.employee.test;

import java.util.HashSet;

import com.techlabs.employee.Employee;
import com.techlabs.employee.EmployeeFileDataLoader;
import com.techlabs.employee.EmployeeSetAnalyzer;
import com.techlabs.employee.EmployeeURLDataLoader;

public class EmployeeTest {

	public static void main(String[] args) {
		EmployeeFileDataLoader loaderFile=new EmployeeFileDataLoader();
		HashSet<Employee> employees=loaderFile.loadEmployeesFile("resources\\dataFile.txt");
		displayEmp(employees);
		
		HashSet<Employee> employeesOnline=new EmployeeURLDataLoader().loadEmployeesURL("https://swabhav-tech.firebaseapp.com/emp.txt ");
		displayEmp(employeesOnline);
	}

	private static void displayEmp(HashSet<Employee> employees) {
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		System.out.println("size:"+employees.size());
	}

}
