package com.techlabs.cart;

public class Product {

	private final String id;
	private final String name;
	private final double cost;
	private final float discountPercent;
	
	public Product(String id, String name, double cost, float discountPercent) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.discountPercent = discountPercent;
	}
	
	public double finalCost() {
		return cost-(cost*(discountPercent)/100);
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

	public float getDiscountPercent() {
		return discountPercent;
	}

	
}
