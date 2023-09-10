package com.sachistha.javaSE.inheritance;

public class Student extends Person{
	int id;
	String stream;
	int batchYear;
	@Override
	public int getAge() {
		return (2023-birthYear)*12;
	}
	
}
