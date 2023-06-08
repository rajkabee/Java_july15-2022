package com.example.swingIntro;

public class Customer {
	int id;
	String name;
	String address;
	long contact;
	boolean active;
	public Customer(int id, String name, String address, long contact, boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.active = active;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
}
