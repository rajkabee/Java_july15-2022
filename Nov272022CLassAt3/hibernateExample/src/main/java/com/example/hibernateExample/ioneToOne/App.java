package com.example.hibernateExample.ioneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main(String[] args) {
		Configuration con = new Configuration().configure("hbm.cfg.xml")
							.addAnnotatedClass(Product.class)
							.addAnnotatedClass(Category.class);
		Product soap = new Product("Herbal Neem Soap", "Herbal Products", 200f, true);
		Category personalCare =  new Category("Personal Care");
		soap.setCategory(personalCare);
		personalCare.setProduct(soap);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(personalCare);
		session.save(soap);
		tx.commit();
		session.close();
		sf.close();
		System.out.println("Hello World!");
	}
}
