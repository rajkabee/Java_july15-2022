package com.example.jdbcConnection.hibernate.oneToMany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main(String[] args) {
		Configuration con = new Configuration()
							.configure()
							.addAnnotatedClass(Laptop.class)
							.addAnnotatedClass(Student.class);
		Laptop lp1 =  new Laptop(1231233, "Hp Spectre", 150000f);
		Laptop lp2 =  new Laptop(58635, "Acer 4566", 90000f);
		Laptop lp3 =  new Laptop(56783, "asus zeus", 180000f);
		ArrayList<Laptop> laptops = new ArrayList<>();
		laptops.add(lp1);
		laptops.add(lp2);
		laptops.add(lp3);
		Student st = new Student("Sabin Pradhan", laptops);
		lp1.setStudent(st);
		lp2.setStudent(st);
		lp3.setStudent(st);
		Session session = con.buildSessionFactory().openSession();
		session.beginTransaction();
		session.save(lp1);
		session.save(lp2);
		session.save(lp3);
		
		session.save(st);
		session.getTransaction().commit();
		session.close();
		
	}
}
