package com.examples.j2se.oop.encapsulation;
public class Person {
	private int id;
	private String name;
	private long contact;
	private String email;
	
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
