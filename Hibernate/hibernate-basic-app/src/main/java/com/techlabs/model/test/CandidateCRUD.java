package com.techlabs.model.test;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.techlabs.model.Candidate;

public class CandidateCRUD {
	public Candidate readById(Session session,int id) {
//		Criteria cr = session.createCriteria(Candidate.class);
//		cr.add(Restrictions.eq("id", id));
//		Candidate candidate= (Candidate) cr.list().get(0);
		Candidate candidate=(Candidate) session.get(Candidate.class, id);
		return candidate;
	}
	public List<Candidate> readAll(Session session) {
		Criteria cr = session.createCriteria(Candidate.class);
		List<Candidate> candidates=cr.list();
		return candidates;
		
	}
	public void update(Session session,int id,String name,float cgpa) {
		Candidate candidate=(Candidate) session.get(Candidate.class, id);
		candidate.setName(name);
		candidate.setCgpa(cgpa);
		System.out.println("Updated");
	}
	public void deleted(Session session, int id) {
		Candidate candidate=(Candidate) session.get(Candidate.class, id);
		session.delete(candidate);
		System.out.println("Deleted");
	}
}
