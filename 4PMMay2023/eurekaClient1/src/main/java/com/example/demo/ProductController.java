package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Greetings from client 1";
	}
	
	@GetMapping("/product")
	public Product product() {
		return new Product("Television", 95000f);
	}
	
}
