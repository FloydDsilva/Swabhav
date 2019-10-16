package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.viewmodel.RegisterVM;

public class RegisterAction extends ActionSupport implements ModelDriven<RegisterVM> {
	private RegisterVM vm;
	@Override
	public RegisterVM getModel() {
		vm=new RegisterVM();
		return vm;
	}
	
	public RegisterVM getUser() {
		return vm;
	}
	public void setUser(RegisterVM user) {
		this.vm = user;
	}

	@Override
	public void validate() {
		if("".equals(vm.getName())) {
			addFieldError("name", "Name cannot be empty");
		}
		if(vm.getAge()==0) {
			addFieldError("age", "Age cannot be empty");
		}
		if("".equals(vm.getAddress())) {
			addFieldError("address", "Address cannot be empty");
		}
	}
	
	@Override
	public String execute() throws Exception {
		return "successs";
	}

	public String registerDo() {
		String detailsMessage="Registration Complete! Your Details are as follows\n";
		String nameMsg="Name: "+vm.getName();
		String ageMsg="Age: "+vm.getAge();
		String addressMsg="Address:"+vm.getAddress();
		detailsMessage+=nameMsg+"\n"+ageMsg+"\n"+addressMsg;
		vm.setMessage(detailsMessage);
		return "success";
	}
}
