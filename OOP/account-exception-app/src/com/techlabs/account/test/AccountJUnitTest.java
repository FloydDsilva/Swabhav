package com.techlabs.account.test;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.account.Account;

import junit.framework.Assert;

class AccountJUnitTest {
	int accountNumber=100;
	String name="Sachin";
	double balance=1000;
	Account account = new Account(accountNumber,name,balance);
	@Test
	void testDeposit_ShouldAddMoneyToAccountBalance() {
		account.deposit(1000);
		assertEquals(2000, account.getBalance());
		
		account.deposit(1000);
		assertEquals(3000, account.getBalance());
	}
	
	@Test
	void testWithdraw_ShouldRemoveAmmountFromAccount() {
		account.withdraw(200);
		assertEquals(800, account.getBalance());
		
		account.withdraw(300);
		assertEquals(500, account.getBalance());
	}
	
	@Test
	void testWithdraw_ShouldThrowRuntimeException() {
		try {
			account.withdraw(600);
			assertEquals(1000, account.getBalance());
			
			account.withdraw(700);
			assertEquals(1000, account.getBalance());
		} catch (RuntimeException re) {
		}
	}
	
	@Test
	void constructorTest_ShouldAssignValuesCorrectly() {
		assertEquals(accountNumber,account.getAccountNo());
		assertEquals(name,account.getName());
		assertEquals(balance,account.getBalance());
		
	}
}
