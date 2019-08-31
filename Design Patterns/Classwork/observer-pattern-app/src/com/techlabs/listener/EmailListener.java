package com.techlabs.listener;

import com.techlabs.publisher.Account;
import com.techlabs.publisher.Listener;

public class EmailListener implements Listener {

	@Override
	public void update(Account acount) {
		System.out.println("Email sent!\nBalance is "+account.getBalance());

	}

}
