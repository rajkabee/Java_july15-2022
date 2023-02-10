package com.example.hibernateExample.manyToMany;

import java.util.ArrayList;
import java.util.Arrays;

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
		Product moisurizer = new Product("Herbal moisurizer", "Herbal Products", 500f, true);
		Product shampoo = new Product("Herbal Shampoo ", "Herbal Products", 700f, true);
		Category personalCare =  new Category("Personal Care");
		Category beauty=  new Category("Beauty");
		ArrayList<Category> categories = new ArrayList<>();
		categories.add(beauty);
		categories.add(personalCare);
		soap.setCategories(categories);
		moisurizer.setCategories(categories);
		shampoo.setCategories(categories);
		ArrayList<Product> products = new ArrayList<>();
		products.add(moisurizer);
		products.add(shampoo);
		products.add(soap);
		personalCare.setProducts(products);
		beauty.setProducts(products);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(personalCare);
		session.save(beauty);
		session.save(moisurizer);
		session.save(shampoo);		
		session.save(soap);
		tx.commit();
		session.close();
		sf.close();
		System.out.println("Hello World!");
	}
}
