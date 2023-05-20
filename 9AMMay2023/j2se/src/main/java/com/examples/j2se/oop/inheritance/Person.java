package com.examples.j2se.oop.inheritance;

public class Person {
	int nationalId;
	String name;
	String address;
	
	public Person() {
		super();
		System.out.println("Person.Class");
	}

	public String display() {
		return "Person [nationalId=" + nationalId + ", name=" + name + ", address=" + address + "]";
	}
	
}
