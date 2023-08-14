package com.example.hibernateExamples.intro;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Person p = new Person("Prajwol Shretha", "Banepa");
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Person.class);
		Session session = cfg.buildSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(p);
		tx.commit();
		session.close();
		
		
		
	}
}
