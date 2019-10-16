package com.techlabs.actions;

import com.opensymphony.xwork2.Action;

public class BrowseAction implements Action {
	private String message;

	public String getMessage() {
		return message;
	}

	@Override
	public String execute() throws Exception {
		message = "Good Afternoon";
		return "success";
	}
	
}
