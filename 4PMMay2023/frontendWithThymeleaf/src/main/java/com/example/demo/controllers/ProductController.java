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
import com.example.demo.entities.ProductCategory;
import com.example.demo.repositories.CategoryRepository;
import com.example.demo.repositories.ProductRepository;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@Controller
@RequestMapping("/products")
public class ProductController {
	@Autowired
	ProductRepository productRepo;
	
	@Autowired
	CategoryRepository categoryRepo;
	
	@GetMapping("")
	public String products(Model model) {
		List<Product> products = productRepo.findAll();
		List<ProductCategory> categories = categoryRepo.findAll();
		model.addAttribute("products", products);
		model.addAttribute("categories", categories);
		model.addAttribute("msg", "products");
		return "products";
	}
	@GetMapping("/category/{id}")
	public String productsByCategory(@PathVariable("id") long id, Model model) {
		List<Product> products = productRepo.findByCategoryId(id);
		List<ProductCategory> categories = categoryRepo.findAll();
		model.addAttribute("products", products);
		model.addAttribute("categories", categories);
		return "products";
	}
	@GetMapping("/{id}")
	public String productDetails(@PathVariable("id") long id, Model model) {
		Product product = productRepo.findById(id).get();
		List<ProductCategory> categories = categoryRepo.findAll();
		model.addAttribute("product", product);
		model.addAttribute("categories", categories);
		
		return "productDetails";
	}
	@ResponseBody
	@GetMapping("/addToCart/{id}")
	public Cart addToCart(@PathVariable("id") long id, HttpServletRequest req) {
		Product product = productRepo.findById(id).get();
		CartItem item = new CartItem(product);
		HttpSession session = req.getSession();
		Cart cart = (Cart) session.getAttribute("cart");
		int alreadyExists=0;
		if(cart!=null) {
			for(int i=0 ; i<cart.getItems().size(); i++) {
				if(cart.getItems().get(i).getId()==item.getId()) {
					cart.getItems().get(i).setQuantity(cart.getItems().get(i).getQuantity()+1);
					alreadyExists=1;
				}
			}
			if(alreadyExists==0) {
				cart.getItems().add(item);
			}
		}
		else {
			cart=new Cart();
			cart.setItems(new ArrayList<CartItem>());
			cart.getItems().add(item);
		}
		
		cart.calculateTotals();
		session.setAttribute("cart", cart);
		return cart;
	}
}
