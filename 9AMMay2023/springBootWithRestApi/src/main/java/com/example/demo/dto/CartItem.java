package com.example.demo.dto;

import java.math.BigDecimal;

import com.example.demo.entities.Product;

import lombok.Data;
@Data
public class CartItem{
	
	long id;
	String name;
	String description;
	BigDecimal unitPrice;
	String imageUrl;
	int quantity;
	public CartItem(Product product) {
		super();
		this.id = product.getId();
		this.name = product.getName();
		this.description = product.getDescription();
		this.unitPrice = product.getUnitPrice();
		this.imageUrl = product.getImageUrl();
		this.quantity=1;
	}
	
	
	
	
}