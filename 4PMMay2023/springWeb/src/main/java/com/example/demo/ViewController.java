package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewController {
	@RequestMapping("/home")
	public String index() {
		return "index.html";
	}
	
	/*
	 * @GetMapping("/products") public String products() { return
	 * "Apples, Bananas, Papayas"; }
	 */
	@GetMapping("/products/{id}")
	public String products(@PathVariable("id") int id) {
		String product="";
		product=id==1?"Apples":id==2?"Bananas":id==3?"Papayas":null;
		return product;
	}
	@GetMapping("/products")
	public String productById(@RequestParam("id") int id) {
		String product="";
		product=id==1?"Apples":id==2?"Bananas":id==3?"Papayas":null;
		return product;
	}
	
	@PostMapping("/products")
	public String addProduct(@ModelAttribute("product") Product product) {
		System.out.println(product);
		return "DONE..";
	}
	
}
