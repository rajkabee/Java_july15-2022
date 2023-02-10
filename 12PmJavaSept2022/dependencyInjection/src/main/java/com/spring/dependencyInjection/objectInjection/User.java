package com.spring.dependencyInjection.objectInjection;

public class User {
	private String name;
	private String address;
	private long contact;
	private Job job;
	
	
	
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
	
	public User(String name, String address, long contact, Job job) {
		super();
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.job = job;
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
	
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", address=" + address + ", contact=" + contact + ", job=" + job + "]";
	}
	
	
	
	
}
