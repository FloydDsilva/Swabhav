package com.techlabs.model;

import java.sql.Date;

public class TransactionLog {
	private String name;
	private float amount;
	private String transactionType;
	private Date transactionDate;
	public TransactionLog(String name, float amount, String transactionType, Date transactionDate) {
		this.name = name;
		this.amount = amount;
		this.transactionType = transactionType;
		this.transactionDate = transactionDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	
}
