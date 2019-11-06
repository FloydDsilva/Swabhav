package com.techlabs.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.viewmodel.RegistrationVM;

public class RegistrationLoaderAction implements Action {

	private List<String> genders;
	
	public RegistrationLoaderAction() {
		genders = new ArrayList<String>();
		 
		genders.add("Male");
		genders.add("Female");
		
	}
	
	public List<String> getGenders() {
		return genders;
	}

	public void setGenders(List<String> genders) {
		this.genders = genders;
	}

	@Override
	public String execute() throws Exception {
		return "success";
	}

	
}
