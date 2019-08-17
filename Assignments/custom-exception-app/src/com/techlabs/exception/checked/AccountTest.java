package com.techlabs.exception.checked;

public class AccountTest {

	public static void main(String[] args) {
		try {
			Account account=new Account(1, "sachin");
			display(account);
			Account account2=new Account(1, "Virat");
			display(account2);
		} catch (IdNotUniqueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void display(Account account) {
		System.out.println("Id:"+account.getId()+" Name:"+account.getName());
	}

}
