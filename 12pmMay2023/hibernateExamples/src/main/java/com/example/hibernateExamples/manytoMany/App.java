package com.example.hibernateExamples.manytoMany;

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
		Occupation job1 = new Occupation("Doctor","health care");
		Occupation job2 = new Occupation("Engineer","Infrastructure development");
		Occupation job3 = new Occupation("Accountant","Logging Economic Activity");
		ArrayList<Occupation> jobs = new ArrayList<Occupation>();
		jobs.add(job1);
		jobs.add(job2);
		jobs.add(job3);
		p1.setOccupations(jobs);
		p2.setOccupations(jobs);
		p3.setOccupations(jobs);
		job1.setPeople(people);
		job2.setPeople(people);
		job3.setPeople(people);
		Configuration cfg = new Configuration()
				.configure()
				.addAnnotatedClass(Occupation.class)
				.addAnnotatedClass(Person.class);
		Session session = cfg.buildSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(job1);
		session.save(job2);
		session.save(job3);
		session.save(p1);
		session.save(p2);
		session.save(p3);
		tx.commit();
		session.close();
			
	}
}
