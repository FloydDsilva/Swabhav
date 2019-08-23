package com.techlabs.cart;

public class LineItem {
	
	private final String id;
	private int qauntity;
	private final Product product;
	
	public LineItem(String id, int qauntity, Product product) {
		this.id = id;
		this.qauntity = qauntity;
		this.product = product;
	}
	
	public double itemCost() {
		return qauntity*product.finalCost();
	}

	public String getId() {
		return id;
	}

	public int getQauntity() {
		return qauntity;
	}

	public Product getProduct() {
		return product;
	}

	public void setQuantity(int quantity) {
		this.qauntity=quantity;
	}
	
	
}
