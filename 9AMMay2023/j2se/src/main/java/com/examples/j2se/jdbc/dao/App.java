package com.examples.j2se.jdbc.dao;

import java.sql.SQLException;
import java.util.Scanner;

public class App {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws SQLException {
		char ch;
		Student st;
		int i;
		StudentDao sDao = new StudentDao();
		
		System.out.println("------MENU-------");
		System.out.println("a. Add a new Student");
		System.out.println("b. Get a student details");
		System.out.println("c. Get all student details");
		System.out.println("d. update a student details");
		System.out.println("e. delete a student details");
		System.out.println("Make a Choice: ");
		ch=sc.next().charAt(0);
		sc.nextLine();
		if(ch=='a'||ch=='A') {
			st=getNewStudentDetails();
			i=sDao.save(st);
			if(i==1) {
				System.out.println("Student saved to the database!");
			}
			else {
				System.out.println("task failed!");
			}
		}
		
	}

	private static Student getNewStudentDetails() {
		Student st = new Student();
		System.out.println("Enter new Student's details: ");
		System.out.println("Name: ");
		st.setName(sc.nextLine());
		System.out.println("Contact: ");
		st.setContact(sc.nextLong());
		System.out.println("Is Active(y/n): ");
		st.setActive((sc.next()=="y")?true:false);
		return st;
	}
}
