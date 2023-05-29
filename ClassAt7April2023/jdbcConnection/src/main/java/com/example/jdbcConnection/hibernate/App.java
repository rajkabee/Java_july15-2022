package com.example.jdbcConnection.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main(String[] args) {
		Laptop laptop = new Laptop(1, 5234236, "Lenovo 300", 89000f);
		Configuration con = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Laptop.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		//session.save(laptop);
		Laptop lp = session.find(Laptop.class, 3);
		//System.out.println(lp);
		//session.update(laptop);
		session.delete(lp);
		tx.commit();
		session.close();
		sf.close();
		System.out.println("Success");
	}
}
