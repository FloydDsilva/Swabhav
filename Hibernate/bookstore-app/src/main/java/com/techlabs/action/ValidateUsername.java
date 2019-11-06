package com.techlabs.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.service.AuthService;

public class ValidateUsername implements Action{
	
	@Autowired
	private AuthService auth;
	
	private String username;
	private boolean checkStatus;

	public boolean isCheckStatus() {
		return checkStatus;
	}

	public void setCheckStatus(boolean checkStatus) {
		this.checkStatus = checkStatus;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("Inside validateUsername");
		System.out.println(username);
		
		if(auth.isUsernameTaken(username)) {
			checkStatus = false;
		}
		else {
			checkStatus = true;
		}
		
		return "success";
	}

}
