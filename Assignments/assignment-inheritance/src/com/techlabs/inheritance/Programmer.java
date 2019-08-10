package com.techlabs.inheritance;

public class Programmer extends Employee {
	public int getSalary(){
		return baseSalary+1000;
	}

	@Override
	public String getInfo() {
		return "Programmer";
	}
	
}
