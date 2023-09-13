package com.sachistha.javaSE.inheritance.Q5;

import java.util.Date;

public class Official extends Member{
	String jobTitle;
	boolean isFirstAidTrained;
	
	
	public void introduction() {
		System.out.println("Hello, i'm "+firstName+" "+lastName);
	}
	
	public Official(String firstName, String lastName, Date dob, String gender,String jobTitle,boolean isFirstAidTrained) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.jobTitle = jobTitle;
		this.isFirstAidTrained=isFirstAidTrained;
	}
}
