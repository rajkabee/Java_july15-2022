package com.example.demo.dto;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;
@Data
public class Cart {
	List<CartItem> items;
	int totalNoOfItems;
	BigDecimal totalPrice;
	
	public void evaluateTotals() {
		totalNoOfItems=0;
		totalPrice=BigDecimal.valueOf(0);
		for(int i=0; i<items.size(); i++) {
			totalNoOfItems+=items.get(i).quantity;
			totalPrice=totalPrice.add(BigDecimal.valueOf(items.get(i).quantity).multiply(items.get(i).unitPrice));
		}
	}
}
