package com.techlabs.account.test;

import com.techlabs.account.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account(100, "Sachin", 1000);
		display(account);
		account.deposit(1000);
		display(account);
		account.withdraw(1000);
		display(account);
		account.withdraw(500);
		display(account);
		account.withdraw(10);
		display(account);
		
	}

	private static void display(Account account) {
		System.out.println("Account No." + account.getAccountNo() + " Name:" + account.getName() + " Balance:"
				+ account.getBalance());
	}

}
