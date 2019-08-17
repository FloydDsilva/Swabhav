package com.techlabs.exception.unchecked;

public class AccountTest {

	public static void main(String[] args) {
			Account account=new Account(1, "sachin");
			display(account);
			Account account2=new Account(1, "Virat");
			display(account2);
		}
	

	private static void display(Account account) {
		System.out.println("Id:"+account.getId()+" Name:"+account.getName());
	}

}
