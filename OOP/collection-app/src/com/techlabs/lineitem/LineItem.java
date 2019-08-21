package com.techlabs.lineitem;

public class LineItem implements Comparable<LineItem>{
	private final String productName;
	private final int id;
	private final double cost;
	private final int quantity;
	
	public LineItem(String productName, int id, double cost, int quantity) {
		this.productName = productName;
		this.id = id;
		this.cost = cost;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Name:"+productName+" Id:"+id+" Cost:"+cost+" Quantity:"+quantity+" Total Cost:"+calcTotalCost();
	}
	public double calcTotalCost() {
		return cost*quantity;
	}
	public String getProductName() {
		return productName;
	}
	public int getId() {
		return id;
	}
	public double getCost() {
		return cost;
	}
	public int getQuantity() {
		return quantity;
	}
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.id==((LineItem)obj).id;
	}
	@Override
	public int compareTo(LineItem item) {
		return this.id-item.id;
	}
}
