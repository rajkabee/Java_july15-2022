package com.examples.j2se.jdbc.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String name;
	long contact;
	boolean active;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, long contact, boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.active = active;
	}
	public Student(String name, long contact, boolean active) {
		super();
		this.name = name;
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
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", contact=" + contact + ", active=" + active + "]";
	}
	
	
}
