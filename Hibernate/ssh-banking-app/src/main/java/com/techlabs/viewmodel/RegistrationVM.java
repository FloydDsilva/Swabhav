package com.techlabs.viewmodel;

public class RegistrationVM {
	
	private String accName;
	private String accPassword;
	private float balance;
	private String message;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getAccPassword() {
		return accPassword;
	}
	public void setAccPassword(String accPassword) {
		this.accPassword = accPassword;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	
}
