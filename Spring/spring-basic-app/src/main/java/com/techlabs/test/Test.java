package com.techlabs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.techlabs.service.StudentService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService svc=context.getBean("studSvc",StudentService.class);
		StudentService svc2=context.getBean("studSvc",StudentService.class);
		System.out.println(svc.getStudents().hashCode());
		System.out.println(svc2.getStudents().hashCode());
	}
}
