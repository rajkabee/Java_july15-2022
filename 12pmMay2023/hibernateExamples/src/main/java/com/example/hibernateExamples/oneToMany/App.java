package com.example.hibernateExamples.oneToMany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main(String[] args) {
		Person p1 = new Person("Sudhir Lamichhane", "ktm");
		Person p2 = new Person("Goma Rijal", "Pokhara");
		Person p3 = new Person("Sudip Shrestha", "Butwol");
		ArrayList<Person> people = new ArrayList<>();
		people.add(p1);
		people.add(p2);
		people.add(p3);
		Occupation job = new Occupation("doctor","health care");
		
		p1.setOccupation(job);
		p2.setOccupation(job);
		p3.setOccupation(job);
		job.setPeople(people);
		Configuration cfg = new Configuration()
				.configure()
				.addAnnotatedClass(Occupation.class)
				.addAnnotatedClass(Person.class);
		Session session = cfg.buildSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(job);
		tx.commit();
		session.close();
			
	}
}
