package com.spring.dependencyInjection.annotationConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
	int id;
	String name;
	String address;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	//@Value("${user.id}")
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
