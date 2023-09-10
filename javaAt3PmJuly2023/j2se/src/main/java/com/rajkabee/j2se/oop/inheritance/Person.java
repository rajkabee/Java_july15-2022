package com.rajkabee.j2se.oop.inheritance;

public class Person {
	public String name;
	String address;
	protected long contact;
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", contact=" + contact + "]";
	}
	
}
