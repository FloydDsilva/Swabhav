package com.techlabs.listener;

import com.techlabs.publisher.Account;
import com.techlabs.publisher.Listener;

public class SMSListener implements Listener {

	@Override
	public void update(Account account) {
		System.out.println("SMS sent!\nBalance is "+account.getBalance());
	}

}
