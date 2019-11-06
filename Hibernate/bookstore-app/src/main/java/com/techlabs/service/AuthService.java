package com.techlabs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.repository.BookRepository;

@Service
public class AuthService {
	
	@Autowired
	private BookRepository bookRepo;
	
	public boolean validateUser(String username, String password) {
		boolean isValid = false;
		
		String databasePassword = bookRepo.getPassword(username);
		
		if(databasePassword.equals(password))
			isValid = true;
		
		return isValid;
	}
	
	public boolean isUsernameTaken(String accName) {
		return bookRepo.isUsernameTaken(accName);	
	}

}
