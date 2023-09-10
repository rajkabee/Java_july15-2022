package com.rajkabee.j2se.hibernate.intro;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	int id;
	@Column(name="product_name")
	String name;
	@Column(name="product_manufacturer")
	String manufacturer;
	@Column(name="product_description")	
	String description;
	@Column(name="product_unit_price")	
	float unitPrice;
	@Column(name="product_is_active", nullable = false)
	boolean active;
	public Product(int id, String name, String manufacturer, String description, float unitPrice, boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.manufacturer = manufacturer;
		this.description = description;
		this.unitPrice = unitPrice;
		this.active = active;
	}
	
	
}
