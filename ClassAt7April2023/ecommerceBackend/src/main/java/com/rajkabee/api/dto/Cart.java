package com.rajkabee.api.dto;

import java.math.BigDecimal;
import java.util.List;

public class Cart {
	public List<CartItem> items;
	public BigDecimal totalPrice;
	public int totalQuantity;
	
	public void evaluateTotal(){
		totalQuantity=0;
		totalPrice=BigDecimal.valueOf(0);
		for(int i=0; i<items.size(); i++) {
			totalQuantity+=items.get(i).quantity;
			BigDecimal price = 
					BigDecimal.valueOf(items.get(i).quantity).multiply(items.get(i).unitPrice);
			totalPrice = totalPrice.add(price);		
			System.out.println(totalPrice);
		}
		
	}
}
