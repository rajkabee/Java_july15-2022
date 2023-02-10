package com.example.hibernateExample.ioneToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String manufacturer;
	private float unitPrice;
	private boolean active;
	@ManyToOne
	private Category category;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String name, String manufacturer, float unitPrice, boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.manufacturer = manufacturer;
		this.unitPrice = unitPrice;
		this.active = active;
	}
	public Product(String name, String manufacturer, float unitPrice, boolean active) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.unitPrice = unitPrice;
		this.active = active;
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
	public float getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", manufacturer=" + manufacturer + ", unitPrice=" + unitPrice
				+ ", active=" + active + "]";
	}
	
	
}
