package com.techlabs.polymorphism.employee;

public abstract class Employee {
	private final int emp_number;
	private final String name;
	protected double basicSalary;
	protected final static int NO_OF_MONTHS;
	
	public abstract double calcCTC();
	
	public abstract String getDetails();

	static {
		NO_OF_MONTHS=12;
	}
	
	public Employee(int emp_number, String name, double basicSalary) {
		this.emp_number = emp_number;
		this.name = name;
		this.basicSalary = basicSalary;
	}

	public int getEmp_number() {
		return emp_number;
	}

	public String getName() {
		return name;
	}

	public double getBasicSalary() {
		return basicSalary;
	} 
	
	
}
