package com.techlabs.actions;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;

public class AddStudentLoaderAction implements Action {
	@Override
	public String execute() throws Exception {
		return "success";
	}
}
