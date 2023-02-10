package com.example.springFramework.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="pok")
public class Contact {
	private int id;
	@Autowired
	@Qualifier(value="chitwan")
	private Address address;
	private String phone;
	
	
	public Contact(int id, Address address, String phone) {
		super();
		this.id = id;
		this.address = address;
		this.phone = phone;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Contact [id=" + id + ", address=" + address + ", phone=" + phone + "]";
	}
	
	
	
}
