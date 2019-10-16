package com.techlabs.actions;

import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Student;
import com.techlabs.service.StudentService;
import com.techlabs.viewmodel.AddStudentVM;

public class AddStudentAction extends ActionSupport implements ModelDriven<AddStudentVM>{
	private AddStudentVM vm;
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
	public AddStudentVM getModel() {
		vm=new AddStudentVM();
		return vm;
	}

	public AddStudentVM getVm() {
		return vm;
	}

	public void setVm(AddStudentVM vm) {
		this.vm = vm;
	}
	
	@Override
	public String execute() throws Exception {
		
		return "success";
	}
	
	public String addDo() {
		HttpSession session=ServletActionContext.getRequest().getSession(false);  
        if(session==null || session.getAttribute("userName")==null){  
            return "login";  
        }  
        else{  
        System.out.println("UserName:"+session.getAttribute("userName"));
		Student student=new Student();
		student.setId((UUID.randomUUID()).toString());
		student.setName(vm.getName());
		student.setAge(vm.getAge());
		student.setRollNo(vm.getRollNo());
		StudentService.getInstance().addStudent(student);
		return "success";
		}  
		
	}
}
