package com.sachistha.javaSE.inheritance.Q5;

import java.util.Date;

public class Member {
	String firstName;
	String lastName; 
	Date dob;
	String gender;
	
	public void DisplayFullNameAndDateOfBirth(){
		System.out.println(firstName+" "+lastName+" "+dob.getDate());
	}
	
	
}
