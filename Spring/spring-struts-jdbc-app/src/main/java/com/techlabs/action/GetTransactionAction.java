package com.techlabs.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.Action;

public class GetTransactionAction implements Action {
	//private List<String> transactions=new ArrayList<String>();
	public GetTransactionAction() {
		
	}
	@Override
	public String execute() throws Exception {
//		transactions.add("Deposit");
//		transactions.add("Withdraw");
		return "success";
	}
//	public List<String> getTransactions() {
//		return transactions;
//	}
//	public void setTransactions(List<String> transactions) {
//		this.transactions = transactions;
//	}
	public String getDefaultTransactionsValue(){
		return "Deposit";
	}
}
