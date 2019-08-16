package com.techlabs.polymorphism.employee;

public class Manager extends Employee {
	
	private final double HRA=0.5*basicSalary;
	private final double TA=0.4*basicSalary;
	private final double Bonus=0.3*basicSalary;
	public Manager(int emp_number, String name, double basicSalary) {
		super(emp_number, name, basicSalary);
	}

	@Override
	public double calcCTC() {
		return (basicSalary+HRA+TA+Bonus)*NO_OF_MONTHS;
	}

	@Override
	public String getDetails() {
		return "HRA:"+HRA+" TA:"+TA+" Bonus"+Bonus;
	}
	public double getHRA() {
		return HRA;
	}

	public double getTA() {
		return TA;
	}

	public double getBonus() {
		return Bonus;
	}

	
}
