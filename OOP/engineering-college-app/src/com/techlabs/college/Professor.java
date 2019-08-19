package com.techlabs.college;

public class Professor extends Person implements IPayable {
	private static final int NUM_OF_MONTHS;
	
	private final double basicSalary;
	
	private double HRA;
	private double TA;

	static {
		NUM_OF_MONTHS=12;
	}
	
	public Professor(String id, String adress, String dob,double basicSalary) {
		super(id, adress, dob);
		this.basicSalary=basicSalary;
	}

	@Override
	public double calcSalary() {
		TA=0.2*basicSalary;
		HRA=0.3*basicSalary;
		return (basicSalary+HRA+TA)*NUM_OF_MONTHS;
	}

	@Override
	public String getDetails() {
		double salary=calcSalary();
		return "Basic Salary:"+basicSalary+" HRA:"+HRA+" TA:"+TA+"\nTotal Salary="+salary;
	}

}
