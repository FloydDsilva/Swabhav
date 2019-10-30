package com.techlabs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.repository.BankRepository;
@Service
public class LoginService {
	@Autowired
	private BankRepository bankRepository;

	public boolean isValidUser(String username,String password) {
		return (bankRepository.getPassword(username).equals(password))?true:false;
	}
	public boolean isValidName(String name) {
		return bankRepository.isValidName(name);
	}
}
