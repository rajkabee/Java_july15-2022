package com.example.demo.restControllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;

@RestController
public class ProductController {
	static Product product=null;
	List<Product> products = Arrays.asList(new Product[] {
			new Product(1, "Pencil", 10f),
			new Product(2, "Paper", 500f),
			new Product(3, "Notebook", 98f),
			new Product(4, "Pen", 20f),
			new Product(5, "Stapler", 176f),
			
	});
	@GetMapping("products")
	public List<Product> getProducts() {
		return products;
	}
	@GetMapping("products/{id}")
	public Product getProduct(@PathVariable("id") int id) {
		product=null;
		products.forEach(p->{
			if(p.getId()==id) {
				this.product= p;
			}
		});
		return product;
	}
	
//	@PostMapping("/products")
//	public String addProduct(@RequestBody Product product) {
//		products.add(product);
//		System.out.println(product);
//		return "Product added Successfully";
//	}
	@PostMapping("/products")
	public String addProduct(@RequestParam("id") int id,
							@RequestParam("name") String name,
							@RequestParam("price") float price
			) {
		Product product = new Product(id,name, price);
		//products.add(product);
		System.out.println(product);
		return "Product added Successfully";
	}
	
}
