package com.example.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        Product p = new Product("Cowboy Hat", "nepal Textile", "leather made", 1234.23f, 34);
        
        Configuration con = new Configuration()
        				.configure("hibernate.cfg.xml")
        				.addAnnotatedClass(Product.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(p);
        
        tx.commit();
        session.close();
        
    	System.out.println( "Hello World!" );
    }
}
