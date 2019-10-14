package com.techlabs.actions;

import com.opensymphony.xwork2.Action;

public class WelcomeAction implements Action {

	@Override
	public String execute() throws Exception {
		System.out.println("In Welcome action");
		return "success";
	}

}
