package com.spring.springExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("pd")
public class Product {
	private int id;
	private String name;
	private String manufacturer;
	private float price;
	@Autowired
	@Qualifier("category")
	private Category category;
	
	
	public Product() {
	}

	public Product(int id, String name, String manufacturer, float price) {
		this.id = id;
		this.name = name;
		this.manufacturer = manufacturer;
		this.price = price;
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public void init() {
		System.out.println("Product bean created...");
	}
	
	public void destroy() {
		System.out.println("Product bean destroyed...");
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", manufacturer=" + manufacturer + ", price=" + price
				+ ", category=" + category + "]";
	}
	
	
	
	
}
