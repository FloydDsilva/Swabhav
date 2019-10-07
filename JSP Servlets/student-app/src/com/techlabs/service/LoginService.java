package com.techlabs.service;

public class LoginService {
	private String username="admin";
	private String password="admin";
	public boolean isValidUser(String username,String password) {
		return (username.equals(getUsername())&&password.equals(getPassword()))?true:false;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
}
