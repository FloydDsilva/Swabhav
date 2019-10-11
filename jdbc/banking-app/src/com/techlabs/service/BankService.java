package com.techlabs.service;

import com.techlabs.model.Account;
import com.techlabs.repository.BankRepository;

public class BankService {
	private BankRepository repository;
	public BankService() {
		repository=BankRepository.getInstance();
	}
	public void addContact(Account account) {
		System.out.println(account.getName()+account.getPassword()+account.getAmount());
		repository.addAccount(account);
	}
}
