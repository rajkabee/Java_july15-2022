package com.sachistha.javaSE.inheritance;

public class Person {
	int id;
	String name;
	String address;
	int birthYear;
	
	public Person(int id, String name, String address, int birthYear) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.birthYear = birthYear;
	}
	


	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getAge() {
		return 2023-birthYear;
	}
	
}
