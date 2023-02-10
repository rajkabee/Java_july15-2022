package com.example.hibernateExample.intro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="item")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="product_id")
	private int id;
	private String name;
	private String manufactuere;
	private float unitPrice;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String name, String manufactuere, float unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.manufactuere = manufactuere;
		this.unitPrice = unitPrice;
	}
	public Product(String name, String manufactuere, float unitPrice) {
		super();
		this.name = name;
		this.manufactuere = manufactuere;
		this.unitPrice = unitPrice;
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
	public String getManufactuere() {
		return manufactuere;
	}
	public void setManufactuere(String manufactuere) {
		this.manufactuere = manufactuere;
	}
	public float getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", manufactuere=" + manufactuere + ", unitPrice=" + unitPrice
				+ "]";
	}
	
}
