package com.techlabs.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.TransactionLog;
import com.techlabs.passbook.Passbook;
import com.techlabs.service.BankService;

public class PassbookDownloadAction implements Action {
	@Autowired
	private BankService bankService;
	private List<Passbook> transactions=new ArrayList<Passbook>();
	@Override
	public String execute() throws Exception {
		HttpSession session=ServletActionContext.getRequest().getSession(false);
		List<TransactionLog> completeTransactions=bankService.getTransactions((String)session.getAttribute("name"));
		for(TransactionLog transaction:completeTransactions) {
			Passbook passbook=new Passbook();
			passbook.setAmount(transaction.getAmount());
			passbook.setTransactionDate(transaction.getTransactionDate());
			passbook.setTransactionType(transaction.getTransactionType());
			transactions.add(passbook);
		}
		return "success";
	}
	public List<Passbook> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<Passbook> transactions) {
		this.transactions = transactions;
	}
	
}
