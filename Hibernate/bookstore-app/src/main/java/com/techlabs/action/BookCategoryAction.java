package com.techlabs.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Book;
import com.techlabs.service.BookService;

public class BookCategoryAction implements Action {
	private List<Book> books;
	private String category;
	@Autowired
	private BookService bookService;
	@Override
	public String execute() throws Exception {
		books=bookService.getBookByCategory(category);
		return "success";
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}
