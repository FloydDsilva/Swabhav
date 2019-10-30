package com.techlabs.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.model.Account;
import com.techlabs.model.TransactionLog;
import com.techlabs.repository.BankRepository;
@Service
public class BankService {
	@Autowired
	private BankRepository repository;
	
	public void addAccount(Account account) throws SQLException {
		System.out.println(account.getName()+account.getPassword()+account.getAmount());
		repository.addAccount(account.getName(),account.getPassword(),account.getAmount());
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
	public List<TransactionLog> getTransactions(String name) {
		return repository.getTransactions(name);
	}
	
}
