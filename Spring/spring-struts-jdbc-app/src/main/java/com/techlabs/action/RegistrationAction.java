package com.techlabs.action;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Account;
import com.techlabs.service.BankService;
import com.techlabs.viewmodel.RegistrationVM;

public class RegistrationAction extends ActionSupport implements ModelDriven<RegistrationVM>{
private RegistrationVM regVM;
	
	@Autowired
	private BankService service;
	

	@Override
	public RegistrationVM getModel() {
		regVM = new RegistrationVM();
		return regVM;
	}
	
	@Override
	public void validate() {
		if("".equals(regVM.getAccName()))
			addFieldError("accName", "Name can't be empty");
		
		if("".equals(regVM.getAccPassword()))
			addFieldError("accPassword", "Password can't be empty");
		
		if(regVM.getBalance() == 0)
			addFieldError("balance", "Opening balance can't be 0");
	}
	
	@Override
	public String execute() {
		
		Account account = new Account(regVM.getAccName(), regVM.getAccPassword(), regVM.getBalance());
		try {
			service.addAccount(account);
			return "success";
			
		} catch (SQLException e) {
			regVM.setMessage(e.getMessage());
			return "register";
		}    		
		
	}
}
