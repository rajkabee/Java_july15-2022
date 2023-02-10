package com.spring.dependencyInjection.literals;

public class User {
	private String name;
	private String address;
	private long contact;
	
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, String address, long contact) {
		super();
		this.name = name;
		this.address = address;
		this.contact = contact;
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
	@Override
	public String toString() {
		return "User [name=" + name + ", address=" + address + ", contact=" + contact + "]";
	}
	
	
}
