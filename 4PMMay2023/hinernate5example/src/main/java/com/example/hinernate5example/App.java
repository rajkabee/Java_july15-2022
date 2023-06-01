package com.example.hinernate5example;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
        Account account = new Account(744567, "Sujan Tamang", 45354321f);
        Configuration con = new Configuration()
        		.configure()
        		.addAnnotatedClass(Account.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(account);
        tx.commit();
        
       
        tx = session.beginTransaction();
        List<Account> accounts = session.createQuery("from Account", Account.class).list();
        accounts.forEach(System.out::println);
        tx.commit();
        session.close();
        sf.close();
    	System.out.println( "Hello World!" );
    }
}
