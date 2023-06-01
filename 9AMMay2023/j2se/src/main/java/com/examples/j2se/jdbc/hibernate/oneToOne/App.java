package com.examples.j2se.jdbc.hibernate.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main(String[] args) {
		Laptop lp = new Laptop("Dell 3500");
		Student st =  new Student("Pragati Adhikari", 9876775666l, true, lp);
		Configuration con = new Configuration()
							.configure("hbm.cfg.xml")
							.addAnnotatedClass(Student.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(st);
		tx.commit();
		session.close();
		sf.close();
		System.out.println("done");
	}
}
