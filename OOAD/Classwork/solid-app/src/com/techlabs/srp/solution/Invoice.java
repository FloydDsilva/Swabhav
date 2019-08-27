package com.techlabs.srp.solution;

public class Invoice {
	private final static int GST;
	private final String id;
	private final String name;
	private final double cost;
	private final float discount;
	
	static {
		GST=18;
	}
	public Invoice(String id, String name, double cost, float discount) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.discount = discount;
	}
	
	public double calculateDiscount() {
		return cost*discount/100;
	}
	
	public double calculateTax() {
		return cost*GST/100;
	}
	
	public double calculateTotalCost() {
		return cost+calculateTax()-calculateDiscount();
	}
	
	public static int getGst() {
		return GST;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getCost() {
		return cost;
	}
	public float getDiscount() {
		return discount;
	}
	
}
