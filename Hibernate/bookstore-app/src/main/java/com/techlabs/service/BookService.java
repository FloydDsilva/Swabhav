package com.techlabs.service;

import java.sql.Blob;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.model.Book;
import com.techlabs.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> getBooks(){
		return bookRepository.getBooks();
	}

	public Blob getImage(String id) {
		return bookRepository.getImage(id);
	}
	
	public Book getBookById(String id) {
		return bookRepository.getBookById(id);
	}
	
	public void addCustomer(String username, String password, String email, int age, String gender, long mobileNumber, String location) {
		bookRepository.addCustomer(username, password, email, age, gender, mobileNumber, location);
	}
}
