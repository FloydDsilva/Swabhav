package com.techlabs.employee;

public class Employee {
	private final int id;
	private final String name;
	private final String designation;
	private final Integer managerId;
	private final String doj;
	private final int salary;
	private final Integer commission;
	private final int deptNo;
	
	public Employee(int id, String name, String designation, Integer managerId, String doj, int salary, Integer commission,
			int deptNo) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.managerId = managerId;
		this.doj = doj;
		this.salary = salary;
		this.commission = commission;
		this.deptNo = deptNo;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public String getDoj() {
		return doj;
	}

	public int getSalary() {
		return salary;
	}

	public Integer getCommission() {
		return commission;
	}

	public int getDeptNo() {
		return deptNo;
	}
	
	@Override
	public String toString() {
		return id+" "+name+" "+designation+" "+managerId+" "+doj+" "+salary+" "+commission+" "+deptNo;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (id != ((Employee)obj).id)
			return false;
		return true;
	}
	
	
}
