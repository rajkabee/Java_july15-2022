package com.spring.dependencyInjection.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("user")
public class User {
	int id;
	String name;
	String address;
	@Autowired
	@Qualifier("cameraman")
	Job job;
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
	
	public User(int id, String name, String address, Job job) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.job = job;
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
	public Job getJob() {
		return job;
	}
	
	public void setJob(Job job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", job=" + job + "]";
	}
	
	
}	
