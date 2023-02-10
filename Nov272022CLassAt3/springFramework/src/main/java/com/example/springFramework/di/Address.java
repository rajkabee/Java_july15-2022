package com.example.springFramework.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component(value = "retreat")
public class Address {
	int id;
	String country;
	String city;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int id, String country, String city) {
		super();
		this.id = id;
		this.country = country;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	@Value("${address1.country}")
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", country=" + country + ", city=" + city + "]";
	}
	
}
