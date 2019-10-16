package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String userName,password;
	@Override
	public void validate() {
		if("".equals(getUserName())) {
			addFieldError("userName", "UserName can not be empty");
		}
		if("".equals(getPassword())) {
			addFieldError("password", "Password can not be empty");
		}
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return "success";
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
