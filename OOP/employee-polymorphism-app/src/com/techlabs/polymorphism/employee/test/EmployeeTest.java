package com.techlabs.polymorphism.employee.test;

import com.techlabs.polymorphism.employee.Employee;
import com.techlabs.polymorphism.employee.Manager;
import com.techlabs.polymorphism.employee.Tester;

public class EmployeeTest {

	public static void main(String[] args) {
		Tester tester = new Tester(1, "Yuvraj", 10000);
		printSalarySlip(tester);
		Manager manager=new Manager(2, "Sachin", 10000);
		printSalarySlip(manager);
	}

	private static void printSalarySlip(Employee employee) {
		System.out.println("Information:-"+"Employee Number:" + employee.getEmp_number() + " Name:" + employee.getName()
				+ " Basic Salary:" + employee.getBasicSalary());
		System.out.println("CTC:-"+employee.calcCTC());
		System.out.println("Details:-"+employee.getDetails());
	}

}
