package com.example.springFramework2.objectInjection;

public class Student {
	int id;
	String name;
	String email;
	Laptop laptop;
	public Student(int id, String name, String email, Laptop laptop) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.laptop = laptop;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", laptop=" + laptop + "]";
	}
	
}
