package com.example.jdbcConnection.hibernate.oneToOne;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class OneToOneMapping {
	public static void main(String[] args) {
		Configuration con = new Configuration()
							.configure()
							.addAnnotatedClass(Laptop.class)
							.addAnnotatedClass(Student.class);
		Laptop lp =  new Laptop(1231233, "Hp Spectre", 150000f);
		Student st = new Student("Sabin Pradhan", lp);
		lp.setStudent(st);
		Session session = con.buildSessionFactory().openSession();
		session.beginTransaction();
		session.save(lp);
		session.save(st);
		session.getTransaction().commit();
		session.close();
		
	}
}
