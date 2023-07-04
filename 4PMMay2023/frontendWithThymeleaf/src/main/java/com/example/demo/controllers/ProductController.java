package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entities.Product;
import com.example.demo.repositories.ProductRepository;


@Controller
@RequestMapping("/products")
public class ProductController {
	@Autowired
	ProductRepository productRepo; 
	
	@GetMapping("")
	public String products(Model model) {
		List<Product> products = productRepo.findAll();
		model.addAttribute("products", products);
		return "products";
	}
}
