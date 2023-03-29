package com.example.springFramework2.objectInjection;

public class Laptop {
	int id;
	String model;
	String brand;
	public Laptop(int id, String model, String brand) {
		super();
		this.id = id;
		this.model = model;
		this.brand = brand;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", model=" + model + ", brand=" + brand + "]";
	}
	
}
