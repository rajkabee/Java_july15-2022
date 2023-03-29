package com.rajkabee.mavenHelloWorld.hibernate.oneToMany;

import java.util.ArrayList;
import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main(String[] args) {
		Laptop lp1 = new Laptop("Specter", "HP");
		Laptop lp2 = new Laptop("Exynos", "DELL");
		Laptop lp3 = new Laptop("300", "Lenovo");
		ArrayList<Laptop> laptops = new ArrayList<>();//(ArrayList<Laptop>) Arrays.asList(lp1, lp2, lp3);
		laptops.add(lp3);
		laptops.add(lp2);
		laptops.add(lp1);
		
		Student st = new Student("Sabina", laptops);
		lp1.setStudent(st);
		lp2.setStudent(st);
		lp3.setStudent(st);
		Configuration con = new Configuration().configure("hbm.cfg.xml")
				.addAnnotatedClass(Laptop.class)
				.addAnnotatedClass(Student.class); 
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(lp1);
		session.save(lp2);
		session.save(lp3);
		session.save(st);
		tx.commit();
		session.close();
		sf.close();
		System.out.println("saved");
		
	}
}
