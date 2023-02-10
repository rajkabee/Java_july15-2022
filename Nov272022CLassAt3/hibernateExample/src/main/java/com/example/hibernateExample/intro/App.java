package com.example.hibernateExample.intro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration con = new Configuration().configure("hbm.cfg.xml")
        						.addAnnotatedClass(Product.class);
    	Product p = new Product(1, "Herbal Neem Soap", "Herbal Products", 200f);
    	SessionFactory sf = con.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	session.save(p);
    	tx.commit();
    	session.close();
    	sf.close();
        System.out.println( "Hello World!" );
    }
}
