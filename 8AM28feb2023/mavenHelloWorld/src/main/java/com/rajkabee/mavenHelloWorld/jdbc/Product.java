package com.rajkabee.mavenHelloWorld.jdbc;

public class Product {
	private int id;
	private String name;
	private String manufacturer;
	private boolean active;
	public Product(int id, String name, String manufacturer, boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.manufacturer = manufacturer;
		this.active = active;
	}
	public Product(String name, String manufacturer, boolean active) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.active = active;
	}
	public Product() {
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
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", manufacturer=" + manufacturer + ", active=" + active + "]";
	}
	
}
