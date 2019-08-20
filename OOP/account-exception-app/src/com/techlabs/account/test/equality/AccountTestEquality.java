package com.techlabs.account.test.equality;

import com.techlabs.account.Account;

public class AccountTestEquality {

	public static void main(String[] args) {
		Account account=new Account(1, "Sachin Tendulkar",1000);
		Account account2=new Account(1, "Sachin Tendulkar",1000);
		System.out.println(account==account);
		System.out.println(account==account2);
		System.out.println(account.equals(account));
		System.out.println(account.equals(account2));
		System.out.println(account.toString());
		System.out.println(account);
	}
	

}
