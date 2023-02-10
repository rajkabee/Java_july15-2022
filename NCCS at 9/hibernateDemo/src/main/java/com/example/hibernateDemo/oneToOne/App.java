package com.example.hibernateDemo.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        Product p = new Product("Cowboy Hat", "nepal Textile", "leather made", 1234.23f, 34);
        
        Category mensFashion = new Category("Mens Fashion");
        p.setCategory(mensFashion);
        mensFashion.setProduct(p);
        Configuration con = new Configuration()
        				.configure("hibernate.cfg.xml")
        				.addAnnotatedClass(Product.class)
        				.addAnnotatedClass(Category.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(mensFashion);
        session.save(p);
        
        tx.commit();
        session.close();
        
    	System.out.println( "Hello World!" );
    }
}
