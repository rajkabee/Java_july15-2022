package com.example.jdbcConnection.hibernate.manyToMany;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GetAllFromDB {
	public static void main(String[] args) {
		Configuration con = new Configuration().configure()
							.addAnnotatedClass(Student.class)
							.addAnnotatedClass(Laptop.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		List<Student> sts = (List<Student>)session.createQuery("from Student group by name").list();
		sts.forEach(System.out::println);
		
		session.flush();
		tx.commit();
		session.close();
		sf.close();
		
	}
}
