package com.techlabs.cart;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private final String id;
	private final String name;
	private  List<Order> orders=new ArrayList<Order>();
	
	public Customer(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void addOrder(Order order) {
		orders.add(order);
	}

	public int orderCount() {
		return orders.size();
	}
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<Order> getOrders() {
		return orders;
	}
	
	
}
