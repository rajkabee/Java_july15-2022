package com.rajkabee.mavenHelloWorld.hibernate.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main(String[] args) {
		Laptop lp = new Laptop("Specter", "HP");
		Student st = new Student("Sabina", lp);
		lp.setStudent(st);
		Configuration con = new Configuration().configure("hbm.cfg.xml")
				.addAnnotatedClass(Laptop.class)
				.addAnnotatedClass(Student.class); 
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(lp);
		session.save(st);
		tx.commit();
		session.close();
		sf.close();
		System.out.println("saved");
		
	}
}
