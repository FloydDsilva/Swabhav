package com.techlabs.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Book;
import com.techlabs.service.BookService;

public class BookInfoAction implements Action {
	@Autowired
	private BookService bookService;
	private String id;
	private Book book;
	@Override
	public String execute() throws Exception {
		book=bookService.getBookById(id);
		System.out.println(book.getBookName()+book.getCategory());
		
		return "success";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
}
