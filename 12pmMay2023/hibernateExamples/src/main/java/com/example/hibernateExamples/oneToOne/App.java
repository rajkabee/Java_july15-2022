package com.example.hibernateExamples.oneToOne;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main(String[] args) {
		Person p = new Person("Sudhir Lamichhane", "ktm");
		Occupation job = new Occupation(0, "doctor","health care", p);
		p.setOccupation(job);
		Configuration cfg = new Configuration()
				.configure()
				.addAnnotatedClass(Occupation.class)
				.addAnnotatedClass(Person.class);
		Session session = cfg.buildSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(p);
		session.save(job);
		tx.commit();
		session.close();
			
	}
}
