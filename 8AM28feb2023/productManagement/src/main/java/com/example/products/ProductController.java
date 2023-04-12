package com.example.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.products.repositories.ProductRepository;

import jakarta.persistence.EntityNotFoundException;

@Controller
@RequestMapping("/products")
public class ProductController {
	@Autowired
	ProductRepository productRepository;
	
	@GetMapping
	public String products(Model model) {
		model.addAttribute("products", productRepository.findAll());
		return "products";
	}
	
	
	@PostMapping
	public String addProduct(@ModelAttribute Product product) {
		productRepository.save(product);
		return "redirect:/products";
	}
	
	@GetMapping("/add")
	public String addProductForm() {
		
		return "addProductForm";
	}
	
	@GetMapping("/update")
	public String updateProductForm( @RequestParam("id") int id, Model model) {
		Product pd = productRepository.findById(id).get();
		model.addAttribute("product", pd);
		return "updateProductForm";
	}
	
	@PutMapping
	public String updateProduct(@ModelAttribute Product product , Model model) {
		Product pd = productRepository.findById(product.getId()).orElseThrow(() -> new EntityNotFoundException("Product not exist with id: " + product.getId()));
		productRepository.save(product);
		model.addAttribute("msg", "Product Updated Successfully!");
		return "redirect:/products";
	}
	
	@GetMapping("/delete")
	public String deleteProductForm( @RequestParam("id") int id, Model model) {
		Product pd = productRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Product not exist with id: " + id));
		productRepository.delete(pd);
		model.addAttribute("msg", "Product deleted Successfully!");
		return "redirect:/productsr";
	}
}
