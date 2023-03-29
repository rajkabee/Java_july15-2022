package com.rajkabee.springIOC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="pd")
public class Product {
	int id; 
	String name;
	@Value("${manufacturer}")
	String manufacturer;
	@Autowired
	@Qualifier(value="cat")
	Category category;
	public Product() {
	}


	public Product(int id, String name, String manufacturer, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.manufacturer = manufacturer;
		this.category = category;
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
	@Value("Apple Pie")
	public void setName(String name) {
		this.name = name;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", manufacturer=" + manufacturer + ", category=" + category
				+ "]";
	}
	
	
}
