package com.techlabs.account;

public class Account {
	private final int accountNo;
	private final String name;
	private double balance;
	public Account(int accountNo, String name, double balance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}
	
	public Account(int accountNo, String name) {
		this(accountNo,name,500);
	}
	
	public void deposit(double ammount) {
		balance+=ammount;
	}
	
	public void withdraw(double ammount) {
		if(balance-ammount>=500) {
			balance-=ammount;
		}
	}

	public int getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
	
}
