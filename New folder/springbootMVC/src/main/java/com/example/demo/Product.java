package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="products")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String name;
	String manufacturer;
	String description;
	float price;
	boolean active;
	public Product(String name, String manufacturer, String description, float price, boolean active) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.description = description;
		this.price = price;
		this.active = active;
	}
	
}
