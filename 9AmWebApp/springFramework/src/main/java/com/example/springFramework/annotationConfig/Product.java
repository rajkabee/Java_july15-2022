package com.example.springFramework.annotationConfig;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="pd")
public class Product {
	//@Value("${product.id}")
	int id;
	//@Value("${product.name}")
	String name;
	//@Value("${product.price}")
	float price;
	@PostConstruct
	public void init() {
		System.out.println("Product bean created!");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Product bean destroyed!");
	}
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
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



	public float getPrice() {
		return price;
	}



	public void setPrice(float price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	
}
