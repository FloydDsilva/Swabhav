package com.techlabs.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.TransactionLog;
import com.techlabs.service.BankService;

public class PassbookDownloadAction implements Action {
	@Autowired
	private BankService bankService;
	private List<TransactionLog> transactions;
	@Override
	public String execute() throws Exception {
		HttpSession session=ServletActionContext.getRequest().getSession(false);
		transactions=bankService.getTransactions((String)session.getAttribute("name"));
		return "success";
	}
	public List<TransactionLog> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<TransactionLog> transactions) {
		this.transactions = transactions;
	}
	
}
