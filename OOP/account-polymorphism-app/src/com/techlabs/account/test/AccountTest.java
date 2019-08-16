package com.techlabs.account.test;

import com.techlabs.account.Account;
import com.techlabs.account.CurrentAccount;
import com.techlabs.account.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {
		SavingAccount sa=new SavingAccount("1", "Sachin", 1000);
		printStatement(sa);
		CurrentAccount ca=new CurrentAccount("2", "Virat", 2000);
		printStatement(ca);
		sa.deposit(1000);
		printStatement(sa);
		ca.deposit(1000);
		printStatement(ca);
		sa.withdraw(1000);
		ca.withdraw(1000);
		printStatement(sa);
		printStatement(ca);
		sa.withdraw(500);
		ca.withdraw(7000);
		printStatement(sa);
		printStatement(ca);
		sa.withdraw(10);
		ca.withdraw(10);
		printStatement(sa);
		printStatement(ca);
	}

	private static void printStatement(Account account) {
		System.out.println("Account Number:" + account.getAccNo() + " Name:" + account.getName() + " Balance:"
				+ account.getBalance());
	}

}
