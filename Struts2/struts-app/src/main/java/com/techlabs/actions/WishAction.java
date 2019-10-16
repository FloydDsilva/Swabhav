package com.techlabs.actions;

import com.opensymphony.xwork2.Action;

public class WishAction implements Action {
	private String name;
	private String message;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return "success";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMessage() {
		
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String wishDo() {
		if(name==null) {
			name="!";
		}
		message="Struts welcomes you, "+name;
		return "success";
	}
}
