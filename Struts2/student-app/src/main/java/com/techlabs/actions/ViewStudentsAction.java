package com.techlabs.actions;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Student;
import com.techlabs.service.StudentService;

public class ViewStudentsAction implements Action {
	private List<Student> students;
	
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String execute() throws Exception {
		students=StudentService.getInstance().getStudents();
		return "success";
	}

}
