package com.techlabs.account;

public class InsufficientFundsException extends RuntimeException{
	private final Account account;
	private final double ammount;

	public InsufficientFundsException(Account account,double ammount) {
		this.account = account;
		this.ammount=ammount;
	}
	@Override
	public String getMessage() {
		String message="Dear "+account.getName()+", Your balance after withdrawing "+ammount+" will violate minimum balance of 500";
		return message;
	}
	
}
