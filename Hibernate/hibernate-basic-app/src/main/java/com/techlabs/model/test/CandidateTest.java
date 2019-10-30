package com.techlabs.model.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlabs.model.Candidate;

public class CandidateTest {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		SessionFactory factory=cfg.configure().buildSessionFactory();
		System.out.println(factory.getClass());
		Candidate candidate=new Candidate();
		//candidate.setId(1);
		candidate.setName("Raj");
		candidate.setCgpa(5.9f);
		Candidate candidate2=new Candidate();
		//candidate2.setId(2);
		candidate2.setName("Virat");
		candidate2.setCgpa(7.9f);
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		//session.save(candidate);
		//session.save(candidate2);
		System.out.println("Read All:");
		List<Candidate> candidates=new CandidateCRUD().readAll(session);
		printAll(candidates);
		Candidate candidate3=new CandidateCRUD().readById(session, 2);
		System.out.println("Read By Id:"+candidate3);
		new CandidateCRUD().update(session, 3, "Yuvraj", 6.2f);
		//new CandidateCRUD().deleted(session, 5);
		List<Candidate> candidates2=new CandidateCRUD().readAll(session);
		printAll(candidates2);
		
		transaction.commit();
		session.close();
	}
	public static void printAll(List<Candidate> candidates) {
		for(Candidate cnd:candidates) {
			System.out.println(cnd);
		}
	}
}
