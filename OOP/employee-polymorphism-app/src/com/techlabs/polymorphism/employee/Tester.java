package com.techlabs.polymorphism.employee;

public class Tester extends Employee {
	
	
	private final double Bonus=0.3*basicSalary;
	
	public Tester(int emp_number, String name, double basicSalary) {
		super(emp_number, name, basicSalary);
	}

	@Override
	public double calcCTC() {
		return (basicSalary+Bonus)*NO_OF_MONTHS;
	}
	
	@Override
	public String getDetails() {
		return "Bonus:"+Bonus;
	}

	public double getBonus() {
		return Bonus;
	}

	
}
