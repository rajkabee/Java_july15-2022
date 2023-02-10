package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.Repositories.CategoryRepository;
import com.example.demo.model.Repositories.ProductRepository;
import com.example.demo.model.entity.Category;
import com.example.demo.model.entity.Product;

@Controller
@RequestMapping("/products")
public class ProductController {
	@Autowired
	ProductRepository productRepo;
	
	@Autowired
	CategoryRepository categoryRepo;
	
	
	@RequestMapping("")
	public String products(Model model) {
		List<Product> products = productRepo.findAll();
		model.addAttribute("products", products);
		//model.addAttribute("name", "Kabiraj Shrestha");
		return "products";
	}
	
	@RequestMapping("/{id}")
	public String product(@PathVariable int id, Model model) {
		ArrayList<Product> products = new ArrayList<Product>();
		//products.add(new Product(1, "Peaches", "sweet large peached", true));
		//products.add(new Product(2, "Apples", "sweet large Apples", true));
		//products.add(new Product(3, "Papayas", "sweet large Papayas", true));
		Product p = new Product();
		for(int i=0; i<3; i++) {
			if(products.get(i).getId()==id) {
				p=products.get(i);
			}
		}
		model.addAttribute("product",p);
		return "productDetails";
	}
	
	@GetMapping("/add")
	public String addProductForm(Model model) {
		List<Category> categories = categoryRepo.findAll();
		model.addAttribute("categories",categories);
		return "addProductForm";
	}
	
	/*
	@ResponseBody
	@PostMapping("/add")
	public String addProduct(
				@RequestParam("name") String name,
				@RequestParam("manufacturer") String manufacturer,
				@RequestParam("description") String description,
				@RequestParam("price") float price	
			) {
		return "Product "+name+" "+price+" added successfully...";
	}
	*/
	@ResponseBody
	@PostMapping("/add")
	public String addProduct(@ModelAttribute("product") Product product, @RequestParam("image") MultipartFile image) {
		return product.toString();
	}
	
	@GetMapping("/update/{id}")
	public String updateProductForm(@PathVariable long id,Model model) {
		List<Category> categories = categoryRepo.findAll();
		model.addAttribute("categories",categories);
		Product p = productRepo.findById(id).get();
		model.addAttribute("product", p);
		return "updateProductForm";
	}
}
