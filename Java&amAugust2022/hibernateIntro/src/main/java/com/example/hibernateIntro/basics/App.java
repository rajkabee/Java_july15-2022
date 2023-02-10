package com.example.hibernateIntro.basics;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration con = new Configuration()
			        			.configure("com/example/hibernateIntro/basics/hbm.cfg.xml")
			        			.addAnnotatedClass(Employee.class);
        Employee emp = new Employee("Sanjeep Lama", "Manager", 46765.56f, true);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(emp);
        tx.commit();
        session.close();
    	System.out.println( "Hello World!" );
    }
}
