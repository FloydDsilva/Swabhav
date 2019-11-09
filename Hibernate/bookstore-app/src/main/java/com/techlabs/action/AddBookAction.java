package com.techlabs.action;

import java.io.FileInputStream;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.service.AdminService;
import com.techlabs.service.BookService;
import com.techlabs.viewmodel.AddBookVM;

public class AddBookAction extends ActionSupport implements ModelDriven<AddBookVM>{

	private AddBookVM addVM;
	@Autowired
	private AdminService adminService;
	
	@Override
	public AddBookVM getModel() {
		addVM = new AddBookVM();
		return addVM;
	}
	
	@Override
	public void validate() {
		if ("".equals(addVM.getBookName()))
			addFieldError("bookName", "Book Name can't be empty");
		if ("".equals(addVM.getCategory()))
			addFieldError("category", "Category can't be empty");
		if (addVM.getPrice() == 0)
			addFieldError("price", "price can't be zero");
		if (addVM.getQuantity() == 0)
			addFieldError("quantity", "Quantity can't be zero");
		if(addVM.getImage() == null)
			addFieldError("image", "Please select an image");

	}

	@Override
	public String execute() throws Exception {
		FileInputStream inputStream = new FileInputStream(addVM.getImage());
		byte data[] = new byte[(int)addVM.getImage().length()];
		inputStream.read(data);
		StringBuilder imageString = new StringBuilder();
		imageString.append("data:image/jpg;base64,");
		imageString.append(Base64.getEncoder().encodeToString(data));
		System.out.println("Length is: " + imageString.toString().length());
		String encodedImage = imageString.toString();
		inputStream.close();
		
		adminService.addBook(addVM.getBookName(), addVM.getCategory(), addVM.getPrice(), addVM.getQuantity(), encodedImage);
		return "success";
	}

	
	

}
