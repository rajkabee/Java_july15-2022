package com.rajkabee.api.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rajkabee.api.entities.Product;
import com.rajkabee.api.model.ProductRepository;

@RestController
@RequestMapping(value="/products")
public class ProductController {
	@Autowired
	ProductRepository productRepo;
	
	@RequestMapping(value="/", method= RequestMethod.POST)
	public Product addProduct(@RequestBody Product product) {
		return productRepo.save(product);
	}
	@GetMapping("/hello")
	public String hello() {
		return "hello from producer";
	}
	
}
