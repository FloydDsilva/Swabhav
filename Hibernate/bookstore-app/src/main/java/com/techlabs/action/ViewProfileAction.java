package com.techlabs.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Customer;
import com.techlabs.service.CustomerService;

public class ViewProfileAction implements Action {
	@Autowired
	private CustomerService customerService;
	private Customer customer;
	@Override
	public String execute() throws Exception {
		HttpSession session=ServletActionContext.getRequest().getSession(false);
		String name=(String) session.getAttribute("loggedIn");
		customer=customerService.getCustomer(name);
		return "success";
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
