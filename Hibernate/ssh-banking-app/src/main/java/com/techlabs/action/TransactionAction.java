package com.techlabs.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.service.BankService;

public class TransactionAction extends ActionSupport {
	private String message;
	private String transaction;
	private float amount;
	@Autowired
	private BankService bankService;
	@Override
	public void validate() {
		if(amount<=0) {
			addFieldError("amount", "Amount is Improper");
		}
	}
	@Override
	public String execute() throws Exception {
		System.out.println(getTransaction());
		HttpSession session=ServletActionContext.getRequest().getSession(false);
		String name=(String) session.getAttribute("name");
		if(getTransaction().equals("Deposit")) {
			bankService.deposit(name, amount);
		}
		else {
			bankService.withdraw(name, amount);
		}
		return "success";
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getTransaction() {
		return transaction;
	}
	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}
}
