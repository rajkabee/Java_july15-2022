package com.rajkabee.j2se.hibernate.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main(String[] args) {
		Configuration con = new Configuration().configure()
				.addAnnotatedClass(Product.class)
				.addAnnotatedClass(Category.class);
		Product pd = new Product(0, "Apple Juice", "Real", "Artificial Fruit Flavours", 200f, true, null);
		Category cat = new Category(0, "Juice", pd);
		pd.setCategory(cat);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(pd);
		session.save(cat);
		tx.commit();
		session.close();
		sf.close();
	}
}
