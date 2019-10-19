package com.techlabs.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.service.LoginService;

public class LoginAction extends ActionSupport implements SessionAware{
	@Autowired
	LoginService loginService;
	private String name,password,errorMsg;
	private SessionMap<String, Object> session;
	@Override
	public void validate() {
		if("".equals(getName())) {
			addFieldError("name", "Name can not be empty");
		}
		if("".equals(getPassword())) {
			addFieldError("password", "Password can not be empty");
		}
	}
	@Override
	public String execute() throws Exception {
		System.out.println("Name"+name+"Password"+password);
		
		if(loginService.isValidUser(name, password)) {
			session.put("name", name);
			return "success";
		}
		else {
			errorMsg="Invalid User";
			return "error";
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	/*
	 * public SessionMap<String, Object> getSession() { return session; }
	 */
	@Override
	public void setSession(Map<String, Object> session) {
		this.session=(SessionMap<String, Object>) session;
		
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	

}
