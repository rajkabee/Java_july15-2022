package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyRestController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello from my first Spring Boot application!";
	}
	
	@GetMapping("/products")
	public Product products() {
		return new Product(1, "Hoodie", 2900f);
	}
	
	@PostMapping("/products")
	public Product addProduct(@ModelAttribute Product product) {
		product.setName("Trouser");
		return product;
	}
	
	@RequestMapping("/name")
	public String getName(@RequestParam("id") int id) {
		return id+". kabiraj Shrestha";
	}
	
	@RequestMapping("/product/{id}")
	public Product getProducts(@PathVariable("id") int id) {
		return new Product(id, "Table Lamp", 23456.34f);
	}
	
}
