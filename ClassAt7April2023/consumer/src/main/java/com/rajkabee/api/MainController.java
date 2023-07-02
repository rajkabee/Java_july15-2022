package com.rajkabee.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello from consumer";
	}
	
	@GetMapping("/helloProducer")
	public String helloProducer() {
		return restTemplate.getForObject("http://localhost:8762/products/hello", String.class);
	}
	
	@GetMapping("/products/{id}")
	public Product getProduct(@PathVariable("id") int id) {
		return restTemplate.getForObject("http://localhost:8762/api/products/"+id, Product.class);
	}
}
