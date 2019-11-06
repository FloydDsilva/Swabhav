package com.techlabs.action;

import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.service.BookService;
import com.techlabs.viewmodel.RegistrationVM;

public class RegistrationAction extends ActionSupport implements ModelDriven<RegistrationVM> {

	private RegistrationVM regVM;

	@Autowired
	private BookService bookService;

	@Override
	public RegistrationVM getModel() {
		regVM = new RegistrationVM();
		return regVM;
	}

	@Override
	public void validate() {
		if ("".equals(regVM.getUsername()))
			addFieldError("username", "Username can't be empty");

		if ("".equals(regVM.getPassword()))
			addFieldError("password", "Password can't be empty");

		if ("".equals(regVM.getEmail()))
			addFieldError("email", "Email can't be empty");

		if (regVM.getAge() == 0)
			addFieldError("age", "Age can't be 0");

		if ("".equals(regVM.getGender()))
			addFieldError("gender", "Gender can't be empty");

		if (regVM.getAge() == 0)
			addFieldError("mobileNumber", "Mobile number can't be 0");

		if ("".equals(regVM.getLocation()))
			addFieldError("location", "Location can't be empty");
	}

	@Override
	public String execute() {
			bookService.addCustomer(regVM.getUsername(), regVM.getPassword(), regVM.getEmail(), regVM.getAge(), regVM.getGender(), regVM.getMobileNumber(), regVM.getLocation());
			return "success";
	}

}
