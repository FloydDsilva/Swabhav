package com.techlabs.account;

import java.io.Serializable;

public class Account implements Serializable{
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
	
	@Override
	public String toString() {
		String parent = super.toString();
		return "no:"+getAccountNo()+"\nname:"+getName()+"\nbalance:"+getBalance()+"\nprevious code:"+parent;
		
	}
	@Override
	public boolean equals(Object obj) {
		boolean equal=false;
		Account account=(Account)obj;
		if(accountNo==account.accountNo) {
			equal=true;
		}
		return equal;
	}
}
