package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entities.Product;
import com.example.demo.repos.ProductRepository;

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
	@ResponseBody
	@GetMapping("/products/addToCart/{id}")
	public Product addTocart(@PathVariable("id") long id, Model model) {
		Product product = productRepo.findById(id).get();
		model.addAttribute("product", product);
		return product;
	}
}
