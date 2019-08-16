package com.techlabs.polymorphism.employee;

public class Developer extends Employee {
	private final double PA=0.4*basicSalary;
	private final double TA=0.3*basicSalary;

	public Developer(int emp_number, String name, double basicSalary) {
		super(emp_number, name, basicSalary);
	}

	@Override
	public double calcCTC() {
		return (basicSalary+PA+TA)*NO_OF_MONTHS;
	}

	public double getPA() {
		return PA;
	}

	@Override
	public String getDetails() {
		return "PA:"+PA+" TA"+TA;
	}
	
	public double getTA() {
		return TA;
	}

	
}
