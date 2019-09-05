package com.techlabs.publisher;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private final String accNo;
	private final String name;
	private double balance;
	private List<Listener> listeners;
	
	public Account(String accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		listeners=new ArrayList<Listener>();
	}
	
	public void deposit(double ammount) {
		balance+=ammount;
		notifyListeners();
	}
	
	public void withdraw(double ammount) {
		balance-=ammount;
		notifyListeners();
	}
	
	public void addListener(Listener listener) {
		listeners.add(listener);
	}

	public void notifyListeners() {
		for (Listener listener : listeners) {
			listener.update(this);
		}
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

	public List<Listener> getListeners() {
		return listeners;
	}
	
}
