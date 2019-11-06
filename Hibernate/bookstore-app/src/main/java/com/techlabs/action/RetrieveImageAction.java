package com.techlabs.action;

import java.io.OutputStream;
import java.sql.Blob;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Book;
import com.techlabs.service.BookService;

public class RetrieveImageAction implements Action{
	
	@Autowired
	private BookService bookService;
	
	private List<Book> books;
	private String id;

	@Override
	public String execute() throws Exception {
		System.out.println("In retrieve execute");
		HttpServletResponse response = ServletActionContext.getResponse();
			Blob ph = bookService.getImage(id);
			byte data[] = ph.getBytes(1, (int) ph.length());
			OutputStream out = response.getOutputStream();
			out.write(data);
			out.flush();
			out.close();
		
		return "success";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
	

}
