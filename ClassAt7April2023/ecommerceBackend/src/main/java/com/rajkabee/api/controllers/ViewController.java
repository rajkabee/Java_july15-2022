package com.rajkabee.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rajkabee.api.repos.CategoryRepository;
import com.rajkabee.api.repos.ProductRepository;

@Controller
public class ViewController {
	
	@Autowired
	ProductRepository productRepo;
	@Autowired
	CategoryRepository categoryRepo;
	
	@RequestMapping("")
	public String index(Model model) {
		model.addAttribute("products", productRepo.findAll());
		model.addAttribute("categories", categoryRepo.findAll());
		model.addAttribute("msg", "products");
		return "index";
	}
	@GetMapping("products/category/{id}")
	public String productsByCategory(@PathVariable("id") long id, Model model) {
		model.addAttribute("products", productRepo.findByCategoryId(id));
		return "index";
	}
	@GetMapping("products/{id}")
	public String productDetails(@PathVariable("id") long id, Model model) {
		model.addAttribute("product", productRepo.findById(id).get());
		
		return "productDetails";
	}
}
