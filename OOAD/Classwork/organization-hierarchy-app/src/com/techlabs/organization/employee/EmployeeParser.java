package com.techlabs.organization.employee;

public class EmployeeParser {
	public Employee parseEmp(String[] values) {
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
	private Integer convertNull(String string) {
		if(string.equalsIgnoreCase("null")) {
			return null;
		}
		return Integer.parseInt(string);
	}
	
}
