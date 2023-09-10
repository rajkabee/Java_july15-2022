package com.rajkabee.j2se.hibernate.intro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main(String[] args) {
		Configuration con = new Configuration().configure()
							.addAnnotatedClass(Product.class);
		Product pd =  new Product(0,"Apple Juice", "Real", "Artificial Fruit Flavours", 200f, true);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(pd);
		tx.commit();
		session.close();
		sf.close();
		
	}
}
