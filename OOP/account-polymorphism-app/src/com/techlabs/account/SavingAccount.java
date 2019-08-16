package com.techlabs.account;

public class SavingAccount extends Account {
	private final int MIN_BALANCE=500; 
	public SavingAccount(String accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	@Override
	public void withdraw(double ammount) {
		if((balance-ammount)>=MIN_BALANCE) {
			balance-=ammount;
		}
	}

}
