package com.techlabs.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Student;
import com.techlabs.service.StudentService;

public class StudentAction implements Action {
	@Autowired
	private StudentService studentService;
	
	@Override
	public String execute() throws Exception {
		System.out.println(studentService.getStudents().size());
		return "none";
	}
	
}
