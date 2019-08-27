package com.techlabs.ocp.solution.test;

import com.techlabs.ocp.solution.FixedDeposit;
import com.techlabs.ocp.solution.NewYearRateCalculator;
import com.techlabs.ocp.solution.NormalRateCalculator;

public class FixedDepositTest {

	public static void main(String[] args) {
		FixedDeposit fd = new FixedDeposit("Sachin", 100, 2, new NewYearRateCalculator());
		printFdDetails(fd);
	}

	private static void printFdDetails(FixedDeposit fd) {
		System.out.println("Name:" + fd.getName() + " Principal:" + fd.getPrincipal() + " Years:" + fd.getYears()
				+ " Rate:" + fd.getRate() + " SI:" + fd.calculateSI());
	}
}
