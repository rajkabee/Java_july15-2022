package com.example.coreJava.jdbc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	int id;
	String name;
	float price;
	boolean isActive;
	public Product(String name, float price, boolean isActive) {
		super();
		this.name = name;
		this.price = price;
		this.isActive = isActive;
	}
	
	
}
