package com.rajkabee.springFrameworkExample.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("pupil")
public class Student {
	int id;
	String name;
	String email;
	@Autowired
	@Qualifier("machine")
	Laptop lp; 
	
	
	public Laptop getLp() {
		return lp;
	}
	public void setLp(Laptop lp) {
		this.lp = lp;
	}
	public Student(int id, String name, String email, Laptop lp) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.lp = lp;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	@Value("${student.id}")
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Value("${student.name}")
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	@Value("${student.email}")
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", lp=" + lp + "]";
	}
	
	
}
