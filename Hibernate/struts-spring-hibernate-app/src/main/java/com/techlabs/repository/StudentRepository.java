package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.model.Student;
@Repository
public class StudentRepository {
	@Autowired
	private SessionFactory sessionFactory;
	
	List<Student> students=new ArrayList<Student>();
	
	private StudentRepository() {
		System.out.println("In Student repository");
//		Session session=sessionFactory.openSession();
//		Transaction transaction=session.beginTransaction();
//		Criteria cr = session.createCriteria(Student.class);
//		students=cr.list();
//		
//		transaction.commit();
//		session.close();
		System.out.println(UUID.randomUUID());
		System.out.println(UUID.randomUUID().toString());
		System.out.println(UUID.randomUUID().toString());
	}
	
	
	
	
	public Student fetchStudent(UUID id) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Student student=(Student) session.get(Student.class, id);
		transaction.commit();
		session.close();
		return student;
	}
	
	public List<Student> getStudents() {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Criteria cr = session.createCriteria(Student.class);
		students=cr.list();
		transaction.commit();
		session.close();
		return students;
	}

	public void updateStudent(Student studentNew) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Student student=(Student) session.get(Student.class, studentNew.getId());
		student.setName(studentNew.getName());
		student.setRollNo(studentNew.getRollNo());
		student.setAge(studentNew.getAge());
		System.out.println("Updated");
		transaction.commit();
		session.close();
	}
	public void deleteStudent(String studentId) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		System.out.println(studentId);
		Student student=(Student) session.get(Student.class, UUID.fromString(studentId));
		System.out.println(student);
		session.delete(student);
		System.out.println("Deleted");
		transaction.commit();
		session.close();
	}


	public void addStudent(String name, int age, int rollNo) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Student studentNew=new Student();
		studentNew.setName(name);
		studentNew.setAge(age);
		studentNew.setRollNo(rollNo);
		session.save(studentNew);
		transaction.commit();
		session.close();
	}

}
