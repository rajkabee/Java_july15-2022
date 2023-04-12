package com.rajkabee.springFramework.annotationConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component(value = "product")
public class Product {
	//@Value("${product.id}")
	int id;
	//@Value("${product.name}")
	String name;
	//@Value("${product.manufacturer}")
	String manufacturer;
	//@Value("${product.price}")
	float price;
	//@Value("${product.active}")
	boolean active;
	@Autowired
	@Qualifier(value = "cat")
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
