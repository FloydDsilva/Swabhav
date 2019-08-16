package com.techlabs.account;

public abstract class Account {
	private final String accNo;
	private final String name;
	protected double balance;

	public abstract void withdraw(double ammount);
	
	public Account(String accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit(double ammount) {
		balance+=ammount;
	}
	
	public String getAccNo() {
		return accNo;
	}
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
}
