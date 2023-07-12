package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.Cart;
import com.example.demo.dto.CartItem;
import com.example.demo.entities.Product;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/cart")
public class CartController {
	@GetMapping("")
	public String cart(HttpServletRequest req, Model model) {
		Cart cart = (Cart)req.getSession().getAttribute("cart"); 
		if(cart==null) {
			return "redirect:/products";
		}
		model.addAttribute("cart", cart);
		return "cart";
	}
	@ResponseBody
	@GetMapping("/getCart")
	public Cart getCart(HttpServletRequest req) {
		Cart cart = (Cart)req.getSession().getAttribute("cart"); 
		return cart;
	}
	
	@ResponseBody
	@GetMapping("/increaseQuantity/{id}")
	public Cart increaseQuantity(@PathVariable("id") long id, HttpServletRequest req) {
		HttpSession session = req.getSession();
		Cart cart = (Cart) session.getAttribute("cart");
		if(cart!=null) {
			for(int i=0 ; i<cart.getItems().size(); i++) {
				if(cart.getItems().get(i).getId()==id) {
					cart.getItems().get(i).setQuantity(cart.getItems().get(i).getQuantity()+1);
				}
			}

		}
		cart.calculateTotals();
		session.setAttribute("cart", cart);
		return cart;
	}
	@ResponseBody
	@GetMapping("/decreaseQuantity/{id}")
	public Cart decreaseQuantity(@PathVariable("id") long id, HttpServletRequest req) {
		HttpSession session = req.getSession();
		Cart cart = (Cart) session.getAttribute("cart");
		if(cart!=null) {
			for(int i=0 ; i<cart.getItems().size(); i++) {
				if(cart.getItems().get(i).getId()==id) {
					if(cart.getItems().get(i).getQuantity()>1) {
						cart.getItems().get(i).setQuantity(cart.getItems().get(i).getQuantity()-1);
					}
					else {
						cart.getItems().remove(i);
					}
				}
			}
			
		}
		cart.calculateTotals();
		session.setAttribute("cart", cart);
		return cart;
	}
	
	
	
	@ResponseBody
	@GetMapping("/removeItem/{id}")
	public Cart removeItem(@PathVariable("id") long id, HttpServletRequest req) {
		HttpSession session = req.getSession();
		Cart cart = (Cart) session.getAttribute("cart");
		if(cart!=null) {
			for(int i=0 ; i<cart.getItems().size(); i++) {
				if(cart.getItems().get(i).getId()==id) {
						cart.getItems().remove(i);
				}
			}
			
		}
		
		cart.calculateTotals();
		session.setAttribute("cart", cart);
		return cart;
	}
	
	
	
}
