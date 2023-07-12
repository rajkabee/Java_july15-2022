package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.Cart;
import com.example.demo.dto.CartItem;
import com.example.demo.entities.Product;
import com.example.demo.repos.ProductRepository;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class ProductController {
	@Autowired
	ProductRepository productRepo;
	
	
	
	@GetMapping("/products")
	public String products(Model model) {
		List<Product> products = productRepo.findAll();
		model.addAttribute("products", products);
		return "products.html";
	}
	@GetMapping("/products/category/{id}")
	public String products(@PathVariable("id") long id, Model model) {
		List<Product> products = productRepo.findByCategoryId(id);
		model.addAttribute("products", products);
		return "products.html";
	}
	
	@GetMapping("/products/{id}")
	public String productdetails(@PathVariable("id") long id, Model model) {
		Product product = productRepo.findById(id).get();
		model.addAttribute("product", product);
		return "productDetails.html";
	}
	@GetMapping("/products/cart")
	public String cart(HttpServletRequest req, Model model) {
		Cart cart = (Cart) req.getSession().getAttribute("cart");
		if(cart==null) {
			return "redirect:/products";
		}
		
		model.addAttribute("cart", cart);
		return "cart";
	}

	@ResponseBody	  
	@GetMapping("/products/addToCart/{id}")
 	public Cart addTocart(@PathVariable("id") long id, HttpServletRequest req) { 
		CartItem item = new CartItem(productRepo.findById(id).get()); 
		HttpSession session = req.getSession();
		Cart cart = (Cart) session.getAttribute("cart");
		
		if(cart!=null) {
			
			int alreadyInCart=0;
			for(int i=0; i<cart.getItems().size(); i++) {
				if(cart.getItems().get(i).getId()==item.getId()) {
					alreadyInCart=1;
					cart.getItems().get(i).setQuantity(cart.getItems().get(i).getQuantity()+1);
				}
			}
			if(alreadyInCart==0) {
				cart.getItems().add(item);
			}
			
			
		}else {
			cart=new Cart();
			cart.setItems(new ArrayList<CartItem>());
			cart.getItems().add(item);
		}
		cart.evaluateTotals();
		session.setAttribute("cart", cart);
		 
		return cart;
	}
	@GetMapping("/products/increaseQuantity/{id}")
	public String increaseQuantity(@PathVariable("id") long id, HttpServletRequest req, Model model) { 
		CartItem item = new CartItem(productRepo.findById(id).get()); 
		HttpSession session = req.getSession();
		Cart cart = (Cart) session.getAttribute("cart");
		
		if(cart!=null) {
			
			int alreadyInCart=0;
			for(int i=0; i<cart.getItems().size(); i++) {
				if(cart.getItems().get(i).getId()==item.getId()) {
					alreadyInCart=1;
					cart.getItems().get(i).setQuantity(cart.getItems().get(i).getQuantity()+1);
				}
			}
			if(alreadyInCart==0) {
				cart.getItems().add(item);
			}
			
			
		}else {
			cart=new Cart();
			cart.setItems(new ArrayList<CartItem>());
			cart.getItems().add(item);
		}
		cart.evaluateTotals();
		
		session.setAttribute("cart", cart);
		model.addAttribute("cart", cart);
		return "cart";
	}
	@GetMapping("/products/decreaseQuantity/{id}")
	public String decreaseQuantity(@PathVariable("id") long id, HttpServletRequest req, Model model) { 
		CartItem item = new CartItem(productRepo.findById(id).get()); 
		HttpSession session = req.getSession();
		Cart cart = (Cart) session.getAttribute("cart");
		
		if(cart!=null) {
			
			int alreadyInCart=0;
			for(int i=0; i<cart.getItems().size(); i++) {
				if(cart.getItems().get(i).getId()==item.getId()) {
					alreadyInCart=1;
					if(cart.getItems().get(i).getQuantity()>1) {
						cart.getItems().get(i).setQuantity(cart.getItems().get(i).getQuantity()-1);
					}
					else {
						cart.getItems().remove(i);
					}
				}
			}	
		}else {
			return "redirect:/products";
		}
		if(cart.getItems().size()==0) {			
			return "redirect:/products";
		}
		cart.evaluateTotals();
		
		session.setAttribute("cart", cart);
		model.addAttribute("cart", cart);
		return "cart";
	}
	@GetMapping("/products/removeItem/{id}")
	public String removeItem(@PathVariable("id") long id, HttpServletRequest req, Model model) { 
		CartItem item = new CartItem(productRepo.findById(id).get()); 
		HttpSession session = req.getSession();
		Cart cart = (Cart) session.getAttribute("cart");
		
		if(cart!=null) {
			for(int i=0; i<cart.getItems().size(); i++) {
				if(cart.getItems().get(i).getId()==item.getId()) {
					cart.getItems().remove(i);
				}
			}	
		}
		if(cart.getItems().size()==0) {			
			return "redirect:/products";
		}
		cart.evaluateTotals();
		
		session.setAttribute("cart", cart);
		model.addAttribute("cart", cart);
		return "cart";
	}
	 
	
}
