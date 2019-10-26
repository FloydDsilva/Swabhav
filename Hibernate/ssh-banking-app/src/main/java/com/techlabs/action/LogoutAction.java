package com.techlabs.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;

public class LogoutAction implements Action {

	@Override
	public String execute() throws Exception {
		HttpSession session=ServletActionContext.getRequest().getSession(false);
		session.invalidate();
		return "success";
	}
	
}
