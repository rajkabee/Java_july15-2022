package com.spring.dependencyInjection.propertiesFile;

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
	//@Value("${user.names}")
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	//@Value("${user.address}")
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContact() {
		return contact;
	}
	//@Value("${user.contact}")
	public void setContact(long contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", address=" + address + ", contact=" + contact + "]";
	}
	
	
}
