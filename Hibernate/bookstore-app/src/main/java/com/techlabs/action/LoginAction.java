package com.techlabs.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.service.AuthService;
import com.techlabs.viewmodel.LoginVM;

public class LoginAction extends ActionSupport implements SessionAware, ModelDriven<LoginVM> {
	
	private SessionMap<String,Object> sessionMap;
	private LoginVM loginVM;
	
	@Autowired
	private AuthService auth;
	
	@Override
	public LoginVM getModel() {
		loginVM = new LoginVM();
		return loginVM;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		sessionMap=(SessionMap)session;
	}
	
	
	@Override
	public String execute() {
		
		if(auth.validateUser(loginVM.getUsername(), loginVM.getPassword())) {
			sessionMap.put("loggedIn",loginVM.getUsername());
			return "success";
		}
		else {
			loginVM.setMessage("Invalid username or password");
		return "login";
		}
	}
	
	@Override
	public void validate() {
		if("".equals(loginVM.getUsername()))
			addFieldError("username", "Username can't be empty");
		
		if("".equals(loginVM.getPassword()))
			addFieldError("password", "Password can't be empty");
	}


}
