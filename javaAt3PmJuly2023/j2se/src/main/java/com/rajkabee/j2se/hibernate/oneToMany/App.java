package com.rajkabee.j2se.hibernate.oneToMany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main(String[] args) {
		Configuration con = new Configuration().configure()
				.addAnnotatedClass(Product.class)
				.addAnnotatedClass(Category.class);
		Product pd1 = new Product(0, "Apple Juice", "Real", "Artificial Fruit Flavours", 200f, true, null);
		Product pd2 = new Product(0, "Mango Juice", "Real", "Artificial Fruit Flavours", 250f, true, null);
		Product pd3 = new Product(0, "Mixed Fruit Juice", "Real", "Artificial Fruit Flavours", 270f, true, null);
		List<Product> products = (List<Product>) Arrays.asList(new Product[] {pd1, pd2, pd3});
		Category cat = new Category(0, "Juice", products);
		
		pd1.setCategory(cat);
		pd2.setCategory(cat);
		pd3.setCategory(cat);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(pd1);
		session.save(pd2);
		session.save(pd3);
		session.save(cat);
		tx.commit();
		session.close();
		sf.close();
	}
}
