package com.example.demo.dto;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;
@Data
public class Cart {
	List<CartItem> items;
	int totalItems;
	BigDecimal totalPrice;
	
	public void calculateTotals() {
		this.totalItems=0;
		this.totalPrice=BigDecimal.valueOf(0);
		items.forEach(item->{
			this.totalItems+=item.getQuantity();
			this.totalPrice=this.totalPrice.add(item.unitPrice.multiply(BigDecimal.valueOf(item.getQuantity())));
		});
		
	}
}
