package com.techlabs.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlabs.model.Department;
import com.techlabs.model.Employee;

public class OneToManyTest {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		SessionFactory sessionFactory=cfg.configure().buildSessionFactory();
		
		Department dept1=new Department();
		dept1.setId(1);
		dept1.setName("IT");
		Department dept2=new Department();
		dept2.setId(2);
		dept2.setName("HR");
		
		Employee e1=new Employee();
		e1.setId(1);
		e1.setName("Sachin");
		e1.setDept(dept1);
		Employee e2=new Employee();
		e2.setId(2);
		e2.setName("Virat");
		e2.setDept(dept1);
		Employee e3=new Employee();
		e3.setId(3);
		e3.setName("Hardik");
		e3.setDept(dept2);
		Employee e4=new Employee();
		e4.setId(4);
		e4.setName("Yuvraj");
		e4.setDept(dept2);
		
		Set<Employee> employees=new HashSet<Employee>();
		Set<Employee> employees2=new HashSet<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees2.add(e3);
		employees2.add(e4);
		dept1.setEmployees(employees);
		System.out.println(employees);
		System.out.println(employees2);
		dept2.setEmployees(employees2);
		
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.saveOrUpdate(dept1);
		session.saveOrUpdate(dept2);
//		session.save(e1);
//		session.save(e2);
//		session.save(e3);
//		session.save(e4);
		transaction.commit();
		session.close();
	}

}
