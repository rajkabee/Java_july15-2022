package com.rajkabee.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestApi {
	//@ResponseBody
	@RequestMapping("/")
	public String hello() {
		System.out.println("hello");
		return "Welcome to my first api";
	}
	
	@GetMapping("/products/{id}")
	public Product getProduct(@PathVariable("id") int id) {
		return new Product(id, "Curtains", "Heavy Silk Curtains", 2345.34f);
	}
//	@GetMapping("/products")
//	public String getOneProduct(@RequestParam("id") int id) {
//		return new Product(id, "Curtains", "Heavy Silk Curtains", 2345.34f).toString();
//	}
	
	@GetMapping("/products")
	public List<Product> products(){
		return Arrays.asList(new Product[] {
				new Product(1, "Curtains", "Heavy Silk Curtains", 2345.34f),
				new Product(2, "Rice", "Long grain Rice", 245.34f),
				new Product(3, "Curtains", "Heavy Silk Curtains", 2345.34f)
		});
	}
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product product) {
		product.id=9876;
		return product;
	}
	
	@DeleteMapping("/products")
	public Product deleteProduct(@RequestBody Product product) {
		product.id=9876;
		return product;
	}
}
