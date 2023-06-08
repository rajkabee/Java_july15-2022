package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	ProductRepository productRepo;
	
	@GetMapping("/")
	public ArrayList<Product> products() {
		ArrayList<Product> products = (ArrayList<Product>) productRepo.findAll();
		return products;
	}
	
	@GetMapping("/{id}")
	public Product products(@PathVariable("id") int id) {
		Product product =  productRepo.findById(id).get();
		return product;
	}
	
	
	@PostMapping(value="/")
	public Product addProduct(@RequestBody Product product) {
		System.out.println();
		return productRepo.save(product);
	}
	
	
	
	@PutMapping("/")
	public String updateProduct(@ModelAttribute("product") Product product) {
		productRepo.save(product);
		return "product saved to the database!";
	}
	
	@DeleteMapping("/products/{id}")
	public String deleteProduct(@PathVariable("id") int id) {
		Product pd = productRepo.findById(id).get();
		productRepo.delete(pd);
		return "redirect:/products";
	}
	
}
