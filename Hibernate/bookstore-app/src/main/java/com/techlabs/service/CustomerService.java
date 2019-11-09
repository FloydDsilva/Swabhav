package com.techlabs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.model.Book;
import com.techlabs.model.Customer;
import com.techlabs.repository.BookRepository;

@Service
public class CustomerService {
	@Autowired
	private BookRepository bookRepository;
	
	public Customer getCustomer(String name) {
		return bookRepository.getCustomer(name);
	}

	public void addToCart(Customer customer, String bookId) {
		bookRepository.addToCart(customer,bookId);
		
	}
}
