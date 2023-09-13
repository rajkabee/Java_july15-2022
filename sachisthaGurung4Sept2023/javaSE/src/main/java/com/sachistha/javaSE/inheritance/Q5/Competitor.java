package com.sachistha.javaSE.inheritance.Q5;

import java.util.Date;

public class Competitor extends Member {
	String sport;
	public void introduction() {
		System.out.println("Hello, i'm "+firstName+" "+lastName+". My Sport is "+sport+". ");
	}
	
	public Competitor(String firstName, String lastName, Date dob, String gender,String sport) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.sport = sport;
	}

	private Competitor() {
	}

	
	
}
