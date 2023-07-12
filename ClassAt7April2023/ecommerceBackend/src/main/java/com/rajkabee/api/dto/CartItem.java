package com.rajkabee.api.dto;

import java.math.BigDecimal;

import com.rajkabee.api.entities.Product;

public class CartItem {
	public long id;
	public String name;
	public String description;
	public BigDecimal unitPrice;
	public int quantity;
	public CartItem(Product product) {
		super();
		this.id = product.getId();
		this.name = product.getName();
		this.description = product.getDescription();
		this.unitPrice = product.getUnitPrice();
		this.quantity = 1;
	}
	
	
}
