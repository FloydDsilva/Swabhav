package com.techlabs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.repository.BookRepository;

@Service
public class AdminService {
	
	@Autowired
	private BookRepository bookRepo;
	
	public void addBook(String bookName, String category, float price, int quantity, String image) {
		bookRepo.addBook(bookName, category, price, quantity, image);
	}
}
