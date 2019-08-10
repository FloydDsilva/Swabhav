package com.techlabs.inheritance.test;

import com.techlabs.inheritance.Employee;
import com.techlabs.inheritance.Programmer;

public class InheritanceTest {

	public static void main(String[] args) {
		Programmer programmer=new Programmer();
		System.out.println(programmer.getInfo()+" Salary="+programmer.getSalary());
		Employee employee=new Employee();
		System.out.println(employee.getInfo()+" Salary="+employee.getSalary());
	}

}
