package com.techlabs.account;

public class CurrentAccount extends Account {
	private final int MAX_CREDIT=-5000;
	public CurrentAccount(String accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	@Override
	public void withdraw(double ammount) {
		if((balance-ammount)>=MAX_CREDIT) {
			balance-=ammount;
		}
	}

}
