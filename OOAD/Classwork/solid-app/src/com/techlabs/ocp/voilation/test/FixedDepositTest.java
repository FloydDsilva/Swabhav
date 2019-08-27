package com.techlabs.ocp.voilation.test;

import com.techlabs.ocp.voilation.FestivalCategory;
import com.techlabs.ocp.voilation.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		FixedDeposit fd=new FixedDeposit("Sachin", 100, 2, FestivalCategory.NEW_YEAR);
		printFdDetails(fd);
	}
	
	private static void printFdDetails(FixedDeposit fd) {
		System.out.println("Name:"+fd.getName()+" Principal:"+fd.getPrincipal()+" Years:"+fd.getYears()+" Rate:"+fd.calculateRate()+" SI:"+fd.calculateSI());
	}
	
}
