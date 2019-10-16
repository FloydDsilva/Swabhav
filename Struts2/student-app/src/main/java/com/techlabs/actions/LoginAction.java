package com.techlabs.actions;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.service.LoginService;

public class LoginAction extends ActionSupport implements SessionAware {
	private String userName,password,errorMsg;
	private SessionMap<String, Object> session;
	@Override
	public void validate() {
		if("".equals(getUserName())) {
			addFieldError("userName", "UserName can not be empty");
		}
		if("".equals(getPassword())) {
			addFieldError("password", "Password can not be empty");
		}
	}
	@Override
	public String execute() throws Exception {
		LoginService loginService=new LoginService();
		if(loginService.isValidUser(userName, password)) {
			session.put("userName", userName);
			return "success";
		}
		else {
			errorMsg="Invalid User";
			return "error";
		}
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
