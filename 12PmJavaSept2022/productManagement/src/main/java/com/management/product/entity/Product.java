package com.management.product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String name;
	String manufacturer;
	float unitPrice;
	boolean isActive;
	public Product(String name, String manufacturer, float unitPrice, boolean isActive) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.unitPrice = unitPrice;
		this.isActive = isActive;
	}
	
	
}
