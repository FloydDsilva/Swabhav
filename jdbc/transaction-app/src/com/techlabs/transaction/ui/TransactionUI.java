package com.techlabs.transaction.ui;

import java.util.Scanner;

import com.techlabs.jdbc.TransactionHandler;

public class TransactionUI {

	public void start() {
		System.out.println("Enter transaction ammount:");
		Scanner sc = new Scanner(System.in);
		int amount=sc.nextInt();
		TransactionHandler transactionHandler=new TransactionHandler();
		transactionHandler.transfer(amount);
	}

}
