package com.techlabs.account.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.techlabs.account.Account;
import com.techlabs.account.InsufficientFundsException;

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
		try {
			account.withdraw(10);
		}
		catch (InsufficientFundsException re) {
			System.out.println(re.getMessage());
		}
		display(account);
		try (ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("resources\\account.ser"))){
			out.writeObject(account);
			//out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		account.deposit(500);
		try (ObjectInputStream in=new ObjectInputStream(new FileInputStream("resources\\account.ser"))){
			Account acc=(Account) in.readObject();
			System.out.println("Deserialized:");
			display(acc);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void display(Account account) {
		System.out.println("Account No." + account.getAccountNo() + " Name:" + account.getName() + " Balance:"
				+ account.getBalance());
	}
	
	

}
