package com.example.jdbcConnection.dao;

public class Product {
	private int id;
	private String name;
	private String manufacturer;
	private String description;
	private float price;
	private boolean active;
	public Product(int id, String name, String manufacturer, String description, float price, boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.manufacturer = manufacturer;
		this.description = description;
		this.price = price;
		this.active = active;
	}
	public Product(String name, String manufacturer, String description, float price, boolean active) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.description = description;
		this.price = price;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", manufacturer=" + manufacturer + ", description="
				+ description + ", price=" + price + ", active=" + active + "]";
	}
	
}
