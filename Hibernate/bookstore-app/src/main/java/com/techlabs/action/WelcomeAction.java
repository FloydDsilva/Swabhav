package com.techlabs.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Book;
import com.techlabs.service.BookService;

public class WelcomeAction implements Action {
	@Autowired
	private BookService bookService;
	private List<Book> books;
	
	@Override
	public String execute() throws Exception {
		books=bookService.getBooks();
		for(Book book:books) {
			System.out.println(book);
		}
		return "success";
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	
}
