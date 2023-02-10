package com.spring.dependencyInjection.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sarada")
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
	@Value("prajwol")
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	@Value("Patan")
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContact() {
		return contact;
	}
	@Value("9841182345")
	public void setContact(long contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", address=" + address + ", contact=" + contact + "]";
	}
	
	
}
