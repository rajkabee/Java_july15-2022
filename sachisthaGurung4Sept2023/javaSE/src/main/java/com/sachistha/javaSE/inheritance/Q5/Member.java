package com.sachistha.javaSE.inheritance.Q5;

import java.util.Date;

public class Member {
	String firstName;
	String lastName; 
	Date dob;
	String gender;
	
	
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Member(String firstName, String lastName, Date dob, String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
	}



	public void DisplayFullNameAndDateOfBirth(){
		System.out.println(firstName+" "+lastName+" "+dob.getDate());
	}
	
	
}
