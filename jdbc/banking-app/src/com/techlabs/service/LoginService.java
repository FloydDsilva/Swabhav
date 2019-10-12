package com.techlabs.service;

import com.techlabs.repository.BankRepository;

public class LoginService {
	private BankRepository bankRepository;
	
	public LoginService() {
		bankRepository=BankRepository.getInstance();
	}

	public boolean isValidUser(String username,String password) {
		return (bankRepository.getPassword(username).equals(password))?true:false;
	}
}
