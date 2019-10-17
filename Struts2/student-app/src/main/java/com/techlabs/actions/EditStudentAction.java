package com.techlabs.actions;

import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Student;
import com.techlabs.service.StudentService;
import com.techlabs.viewmodel.EditStudentVM;

public class EditStudentAction implements ModelDriven<EditStudentVM>,Action{
	private EditStudentVM vm;
	
	

	@Override
	public EditStudentVM getModel() {
		vm=new EditStudentVM();
		return vm;
	}

	public EditStudentVM getVm() {
		return vm;
	}

	public void setVm(EditStudentVM vm) {
		this.vm = vm;
	}
	
	@Override
	public String execute() throws Exception {
		 
		Student student=StudentService.getInstance().fetchStudent(vm.getId());
		vm.setName(student.getName());
		vm.setAge(student.getAge());
		vm.setRollNo(student.getRollNo());
		return "success";
	}
	
}
