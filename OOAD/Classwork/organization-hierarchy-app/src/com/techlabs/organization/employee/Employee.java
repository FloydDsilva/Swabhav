package com.techlabs.organization.employee;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private final int id;
	private final String name;
	private final String designation;
	private final Integer managerId;
	private final String doj;
	private final int salary;
	private final Integer commission;
	private final int deptNo;
	private List<Employee> subordinates;
	
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
		subordinates=new ArrayList<Employee>();
	}

	public static Employee parseEmp(String[] values) {
		int id=Integer.parseInt(values[0]);
		String name=values[1];
		String designation=values[2];
		Integer managerId=convertNull(values[3]);
		String doj=values[4];
		int salary=Integer.parseInt(values[5]);
		Integer commission=convertNull(values[6]);
		int deptNo=Integer.parseInt(values[7]);
		return new Employee(id, name, designation, managerId, doj, salary, commission, deptNo);
	}
	private static Integer convertNull(String string) {
		if(string.equalsIgnoreCase("null")) {
			return null;
		}
		return Integer.parseInt(string);
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
	
	public List<Employee> getSubordinates() {
		return subordinates;
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
