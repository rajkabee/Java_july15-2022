package com.rajkabee.springCore;

public class AccountType {
	int id;
	String name;
	float interest;
	
	
	
	public AccountType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountType(int id, String name, float interest) {
		super();
		this.id = id;
		this.name = name;
		this.interest = interest;
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

	public float getInterest() {
		return interest;
	}

	public void setInterest(float interest) {
		this.interest = interest;
	}

	@Override
	public String toString() {
		return "AccountType [id=" + id + ", name=" + name + ", interest=" + interest + "]";
	}
	
}
