package com.rajkabee.mavenHelloWorld.hibernate.manyToMany;

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
		
		Student st1 = new Student("Sabina", laptops);
		Student st2 = new Student("Rabina", laptops);
		Student st3 = new Student("Pabina", laptops);
		ArrayList<Student> students = new ArrayList<>();
		students.add(st3);
		students.add(st2);
		students.add(st1);
		lp1.setStudents(students);
		lp2.setStudents(students);
		lp3.setStudents(students);
		Configuration con = new Configuration().configure("hbm.cfg.xml")
				.addAnnotatedClass(Laptop.class)
				.addAnnotatedClass(Student.class); 
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(lp1);
		session.save(lp2);
		session.save(lp3);
		session.save(st1);
		session.save(st2);
		session.save(st3);
		tx.commit();
		session.close();
		sf.close();
		System.out.println("saved");
		
	}
}
