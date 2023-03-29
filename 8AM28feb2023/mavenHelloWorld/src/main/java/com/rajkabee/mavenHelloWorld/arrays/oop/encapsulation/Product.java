package com.rajkabee.mavenHelloWorld.arrays.oop.encapsulation;

public class Product {
	private int id;
	private String name;
	private String manufacturer;
	
	public int getId() {
		return id;
		//super.toString();
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
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	
	
}
