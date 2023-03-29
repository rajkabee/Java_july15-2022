package com.rajkabee.mavenHelloWorld.arrays.oop.inheritance;

public class Employee extends Person {
	int empId;
	String position;
	float salary;
	
	@Override
	public String toString() {
		return empId+". "+position+"\t"+salary+"\t"+super.toString();
	}
}
