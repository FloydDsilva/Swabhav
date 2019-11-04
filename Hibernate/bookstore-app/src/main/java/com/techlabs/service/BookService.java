package com.techlabs.service;

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
}
