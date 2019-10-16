package com.techlabs.actions;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;

public class SessionAction implements SessionAware,Action {
	private int oldCount,newCount;
	private SessionMap<String, Object> sessionMap; 
	@Override
	public void setSession(Map<String, Object> map) {
		sessionMap=(SessionMap<String, Object>)map;
	}

	@Override
	public String execute() throws Exception {
		if(sessionMap.get("counter") == null) {
			sessionMap.put("counter",0);
		}
		else {
			oldCount=(int) sessionMap.get("counter");
			sessionMap.put("counter", oldCount+1);
			newCount=(int) sessionMap.get("counter");
		}
		return "success";
	}

	public int getOldCount() {
		return oldCount;
	}

	public int getNewCount() {
		return newCount;
	}
	
}
