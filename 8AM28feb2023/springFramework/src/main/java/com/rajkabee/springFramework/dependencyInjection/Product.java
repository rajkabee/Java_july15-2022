package com.rajkabee.springFramework.dependencyInjection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	int id;
	String name;
	String manufacturer;
	float price;
	boolean active;
	Category category;
	public Product(int id, String name, String manufacturer, float price, boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.manufacturer = manufacturer;
		this.price = price;
		this.active = active;
	}
	
	
}
