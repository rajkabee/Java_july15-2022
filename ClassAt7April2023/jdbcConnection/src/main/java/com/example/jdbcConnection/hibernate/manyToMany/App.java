package com.example.jdbcConnection.hibernate.manyToMany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main(String[] args) {
		Configuration con = new Configuration().configure()
							.addAnnotatedClass(Student.class)
							.addAnnotatedClass(Laptop.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Laptop lp1 =  new Laptop(1231233, "Hp Spectre", 150000f);
		Laptop lp2 =  new Laptop(58635, "Acer 4566", 90000f);
		Laptop lp3 =  new Laptop(56783, "asus zeus", 180000f);
		ArrayList<Laptop> laptops = new ArrayList<>();
		laptops.add(lp1);
		laptops.add(lp2);
		laptops.add(lp3);
		
		Student st1 = new Student("Sunil", laptops);
		Student st2 = new Student("Tara", laptops);
		Student st3 = new Student("Srijana", laptops);
		ArrayList<Student> students = new ArrayList<>();
		students.add(st1);
		students.add(st2);
		students.add(st3);
		lp1.setStudents(students);
		lp2.setStudents(students);
		lp3.setStudents(students);
		
		session.save(lp1);
		session.save(lp2);
		session.save(lp3);
		session.save(st1);
		session.save(st2);
		session.save(st3);
		session.flush();
		tx.commit();
		session.close();
		sf.close();
		
	}
}
