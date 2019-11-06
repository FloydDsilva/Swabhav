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
	private int num=0;
	@Override
	public String execute() throws Exception {
		books=bookService.getBooks();
		return "success";
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public int getNum() {
		int size=getBooks().size();
		int limit=(size>3)?2:(size-1);
		System.out.println(limit);
		return limit;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
	
}
