package com.rajkabee.api.controllers;

import java.net.http.HttpRequest;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rajkabee.api.dto.Cart;
import com.rajkabee.api.dto.CartItem;
import com.rajkabee.api.repos.ProductRepository;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@RestController
public class RestControllerClass {
	@Autowired
	ProductRepository productRepo;
	
	@GetMapping("/products/addToCart/{id}")
	public Cart addToCart(@PathVariable("id") long id, HttpServletRequest req) {
		CartItem item = new CartItem(productRepo.findById(id).get());
		HttpSession session = req.getSession();
		Cart cart = (Cart) session.getAttribute("cart");
		if(cart!=null) {
			int alreadyExists=0;
			for(int i=0; i<cart.items.size(); i++) {
				if(cart.items.get(i).id==item.id) {
					cart.items.get(i).quantity++;
					alreadyExists=1;
				}
			}
			if(alreadyExists==0) {
				cart.items.add(item);
			}
		}
		else {
			cart = new Cart();
			cart.items=new ArrayList<CartItem>();
			cart.items.add(item);
		}
		cart.evaluateTotal();
		session.setAttribute("cart", cart);
		
		return cart;
	}
}
