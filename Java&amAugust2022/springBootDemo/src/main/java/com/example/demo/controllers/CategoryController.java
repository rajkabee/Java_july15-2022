package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Repositories.CategoryRepository;
import com.example.demo.model.entity.Category;

@Controller
@RequestMapping("/categories")
public class CategoryController {
	@Autowired
	CategoryRepository categoryRepo;
	
	@RequestMapping()
	public String categories() {
		return "categories/categories";
	}
	
	@GetMapping("/add")
	public String addCategoryForm() {
		return "categories/addCategoryForm";
	}
	
	@PostMapping("/add")
	public String addCategory(
			@RequestParam("name") String name,
			@RequestParam("description") String description
			) {
		Category category = new Category(0, name, description);
		categoryRepo.save(category);
		return "redirect:/categories";
	}
	
}
