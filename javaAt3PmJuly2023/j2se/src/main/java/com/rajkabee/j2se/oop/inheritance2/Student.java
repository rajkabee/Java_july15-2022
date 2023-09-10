package com.rajkabee.j2se.oop.inheritance2;

import com.rajkabee.j2se.oop.inheritance.Person;

public class Student extends Person {
	public void setContact(long contact) {
		super.contact=contact;
	}
	public long getContact() {
		return super.contact;
	}
//	public void setAddress(String address) {
//		super.address=address;
//	}
}
