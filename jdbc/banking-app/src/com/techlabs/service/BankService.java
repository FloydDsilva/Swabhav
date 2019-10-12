package com.techlabs.service;

import java.sql.SQLException;

import com.techlabs.model.Account;
import com.techlabs.repository.BankRepository;

public class BankService {
	private BankRepository repository;
	public BankService() {
		repository=BankRepository.getInstance();
	}
	public void addAccount(Account account) throws SQLException {
		System.out.println(account.getName()+account.getPassword()+account.getAmount());
		repository.addAccount(account);
	}
	public float getBalance(String name) {
		return repository.getBalance(name);
	}
	public void deposit(String name,float amount) throws SQLException {
		repository.deposit(name, amount);
	}
	public void withdraw(String name,float amount) throws SQLException {
		repository.withdraw(name, amount);
	}
}
