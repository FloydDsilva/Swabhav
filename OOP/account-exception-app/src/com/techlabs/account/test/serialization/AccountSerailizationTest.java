package com.techlabs.account.test.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.techlabs.account.Account;

public class AccountSerailizationTest {

	public static void main(String[] args) {
		Account account=new Account(100, "Sachin", 1000);
		display(account);
		serializeObject(account,"resources\\account.ser");
		account.deposit(500);
		display(account);
		Account acc=deserializeObject("resources\\account.ser");
		display(acc);

	}
	
	private static Account deserializeObject(String path) {
		Account acc=null;
		try (ObjectInputStream in=new ObjectInputStream(new FileInputStream(path))){
			acc=(Account) in.readObject();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return acc;
	}

	private static void serializeObject(Account account,String path) {
		try (ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(path))){
			out.writeObject(account);
			//out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void display(Account account) {
		System.out.println("Account No." + account.getAccountNo() + " Name:" + account.getName() + " Balance:"
				+ account.getBalance());
	}
}
