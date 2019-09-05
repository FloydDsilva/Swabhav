package com.techlabs.account.test;

import com.techlabs.listener.EmailListener;
import com.techlabs.listener.SMSListener;
import com.techlabs.publisher.Account;
import com.techlabs.publisher.Listener;

public class AccountObserverTest {
	public static void main(String[] args) {
		Account account=new Account("1", "Sachin", 1000);
		Listener sms=new SMSListener();
		Listener email=new EmailListener();
		account.addListener(sms);
		account.addListener(email);
		account.deposit(1000);
		account.withdraw(500);
	}
}
