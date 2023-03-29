package com.rajkabee.mavenHelloWorld.arrays.oop.encapsulation.p2;

import com.rajkabee.mavenHelloWorld.arrays.oop.encapsulation.p1.Person;

public class Employee extends Person {
	public Employee(String name) {
		this.name=name;
		
	}
	public Employee() {
		
	}
	public void setName(String name) {
		this.name=name;
	}
}
