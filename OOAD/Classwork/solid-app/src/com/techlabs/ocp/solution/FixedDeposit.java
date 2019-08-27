package com.techlabs.ocp.solution;

public class FixedDeposit {
	private final String name;
	private final double principal;
	private final int years;
	private IRateCalculatable rateCalc;
	
	public FixedDeposit(String name, double principal, int years,IRateCalculatable rate) {
		this.name = name;
		this.principal = principal;
		this.years = years;
		this.rateCalc=rate;
	}
	
	
	
	public double calculateSI() {
		return principal*rateCalc.calculateRate()*years/100;
	}
	public String getName() {
		return name;
	}
	public double getPrincipal() {
		return principal;
	}
	public int getYears() {
		return years;
	}
	
	public double getRate() {
		return rateCalc.calculateRate();
	}
}
