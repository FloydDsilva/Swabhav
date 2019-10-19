package com.techlabs.model;

public class Account {
	private String name;
	private String password;
	private float amount;
	public Account(String name, String password, float amount) {
		this.name = name;
		this.password = password;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	
}
