package com.example.hibernateDemo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "productId")
	long id;
	@Column(name = "productName")
	String name;
	@Column(name = "manufacturer")
	String manufacturer;
	@Column(name = "description")
	String description;
	@Column(name = "price")
	float price;
	@Column(name = "stockQuantity")
	int stock;
	public Product(String name, String manufacturer, String description, float price, int stock) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.description = description;
		this.price = price;
		this.stock = stock;
	}
	
	
}
