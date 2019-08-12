package com.techlabs.account;

import java.io.Serializable;

public class Account implements Serializable{
	private static final long serialVersionUID = 2L;
	private final int accountNo;
	private final String name;
	private double balance;
	private final String desc;
	public Account(int accountNo, String name, double balance,String desc) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
		this.desc=desc;
	}
	
	public Account(int accountNo, String name) {
		this(accountNo,name,500,"Savings");
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

	public String getDescription() {
		return desc;
	}
	
	
	
}
