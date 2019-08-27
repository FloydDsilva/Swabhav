package com.techlabs.ocp.voilation;

public class FixedDeposit {
	private final String name;
	private final double principal;
	private final int years;
	private final FestivalCategory festival;
	
	public FixedDeposit(String name, double principal, int years, FestivalCategory festival) {
		this.name = name;
		this.principal = principal;
		this.years = years;
		this.festival = festival;
	}
	
	public float calculateRate() {
		if(festival==FestivalCategory.NEW_YEAR) {
			return 9f;
		}
		if(festival==FestivalCategory.NEW_YEAR) {
			return 8f;
		}
		return 7.5f;
	}
	
	public double calculateSI() {
		return principal*calculateRate()*years/100;
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
	public FestivalCategory getFestival() {
		return festival;
	}
	
}
