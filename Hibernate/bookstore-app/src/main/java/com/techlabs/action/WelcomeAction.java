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
	private List<Book> comedyBooks;
	private List<Book> romanceBooks;
	private List<Book> thrillerBooks;
	private int c_num=0;
	private int r_num=0;
	private int t_num=0;
	@Override
	public String execute() throws Exception {
		comedyBooks=bookService.getBookByCategory("Comedy");
		romanceBooks=bookService.getBookByCategory("Romance");
		thrillerBooks=bookService.getBookByCategory("Thriller");
		return "success";
	}

	public List<Book> getComedyBooks() {
		return comedyBooks;
	}

	public void setComedyBooks(List<Book> comedyBooks) {
		this.comedyBooks = comedyBooks;
	}

	public List<Book> getRomanceBooks() {
		return romanceBooks;
	}

	public void setRomanceBooks(List<Book> romanceBooks) {
		this.romanceBooks = romanceBooks;
	}

	public List<Book> getThrillerBooks() {
		return thrillerBooks;
	}

	public void setThrillerBooks(List<Book> thrillerBooks) {
		this.thrillerBooks = thrillerBooks;
	}

	public int getC_num() {
		int size=getComedyBooks().size();
		int limit=(size>3)?2:(size-1);
		System.out.println(limit);
		return limit;
	}

	public void setC_num(int c_num) {
		this.c_num = c_num;
	}

	public int getR_num() {
		int size=getRomanceBooks().size();
		int limit=(size>3)?2:(size-1);
		System.out.println(limit);
		return limit;
	}

	public void setR_num(int r_num) {
		this.r_num = r_num;
	}

	public int getT_num() {
		int size=getThrillerBooks().size();
		int limit=(size>3)?2:(size-1);
		System.out.println(limit);
		return limit;
	}

	public void setT_num(int t_num) {
		this.t_num = t_num;
	}

}
