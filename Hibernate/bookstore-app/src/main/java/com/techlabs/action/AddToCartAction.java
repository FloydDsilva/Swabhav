package com.techlabs.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Book;
import com.techlabs.model.Customer;
import com.techlabs.service.BookService;
import com.techlabs.service.CustomerService;

public class AddToCartAction implements Action {
	private String bookId;
	@Autowired
	private BookService bookService;
	@Autowired
	private CustomerService customerService;
	@Override
	public String execute() throws Exception {
		HttpSession session=ServletActionContext.getRequest().getSession(false);
		String name=(String) session.getAttribute("loggedIn");
		//Book book=bookService.getBookById(bookId);
		Customer customer=customerService.getCustomer(name);
		customerService.addToCart(customer,getBookId());
		return "success";
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	
}
