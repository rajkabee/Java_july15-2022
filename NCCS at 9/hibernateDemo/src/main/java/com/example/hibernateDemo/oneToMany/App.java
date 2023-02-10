package com.example.hibernateDemo.oneToMany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
    	  Product p1 = new Product("Cowboy Hat", "nepal Textile", "leather made", 1234.23f, 34);
          Product p2 = new Product("Shoes", "shikhar", "leather made", 2334.23f, 50);
          Product p3 = new Product("Sunglass", "Ray Ban", "Italy made", 2433f, 21);
          ArrayList<Product> products = new ArrayList<Product>();
          products.add(p1);
          products.add(p2);
          products.add(p3);
          Category mensFashion = new Category("Mens Fashion");
          p1.setCategory(mensFashion);
          p2.setCategory(mensFashion);
          p3.setCategory(mensFashion);
          mensFashion.setProducts(products);
        Configuration con = new Configuration()
        				.configure("hibernate.cfg.xml")
        				.addAnnotatedClass(Product.class)
        				.addAnnotatedClass(Category.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(mensFashion);
        session.save(p1);
        session.save(p2);
        session.save(p3);
        
        tx.commit();
        session.close();
        
    	System.out.println( "Hello World!" );
    }
}
