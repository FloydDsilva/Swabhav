package com.techlabs.actions;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Student;
import com.techlabs.service.StudentService;
import com.techlabs.viewmodel.AddStudentVM;
import com.techlabs.viewmodel.EditStudentVM;

public class UpdateStudentAction extends ActionSupport implements ModelDriven<EditStudentVM>{
	private EditStudentVM vm;
	@Autowired
	StudentService studentService;
	

	@Override
	public void validate() {
		if("".equals(vm.getName())) {
			addFieldError("name", "Field cannot be empty");
		}
		if(vm.getAge()==0) {
			addFieldError("age", "Field cannot be empty");
		}
		if(vm.getRollNo()==0) {
			addFieldError("rollNo", "Field cannot be empty");
		}
		
	}

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
		System.out.println("in exec update");
		
		return "success";
	}
	
	public String updateDo() {
		System.out.println("adsa");
		Student studentNew=new Student();
		studentNew.setId(vm.getId());
		studentNew.setName(vm.getName());
		studentNew.setAge(vm.getAge());
		studentNew.setRollNo(vm.getRollNo());
		System.out.println(studentNew);
		studentService.updateStudent(studentNew);
		return "success";
	}
}
