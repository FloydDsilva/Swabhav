package com.techlabs.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.service.LoginService;

public class ValidateNameAction implements Action {
	private String name;
	private boolean validName;
	
	@Autowired
	private LoginService loginService;
	@Override
	public String execute() throws Exception {
		System.out.println("name");
		validName=loginService.isValidName(name);
		return "success";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isValidName() {
		return validName;
	}
	public void setValidName(boolean validName) {
		this.validName = validName;
	}
		
}