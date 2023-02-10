package com.management.product;

import java.util.ArrayList;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.management.product.entity.Product;
import com.management.product.repositories.ProductRepository;

import jakarta.annotation.PostConstruct;

@Controller
public class ProductController {
	@Autowired
	ProductRepository productRepo;
	
	ArrayList<Product> products = new ArrayList<>();
	@PostConstruct
	public void productsList() {
		products.add(new Product(1, "sneakers", "Nike Jordan", 4355.43f, true));
		products.add(new Product(2, "Hand Bag", "Gucci", 24355.43f, true));
		products.add(new Product(3, "Jeans", "Levi's", 3355.43f, true));
		products.add(new Product(4, "V6", "Mercedes", 4355.43f, true));
	}
	
	@GetMapping("products")
	public String productsPage(Model model) {
//		if(products.isEmpty()) {
//			productsList();
//		}
		//model.addAttribute("products", products);
		model.addAttribute("products", productRepo.findAll());
		return "index";
	}
	
	
	@GetMapping("products/add")
	public String addProductForm() {
		return "addProductForm";
	}
//	@PostMapping("products/add")
//	public String addProduct(@RequestParam("name") String name,
//							@RequestParam("manufacturer") String manufacturer,
//							@RequestParam("unitPrice") float unitPrice,
//							@RequestParam("isActive") boolean isActive
//							) {
//		Product product = new Product(name, manufacturer, unitPrice, isActive);
//		System.out.println(product);
//		return "redirect:/products";
//	}
	@PostMapping("products/add")
	public String addProduct(@ModelAttribute Product product
							) {
		//Product product = new Product(name, manufacturer, unitPrice, isActive);
		//System.out.println(product);
		//this.products.add(product);
		this.productRepo.save(product);
		return "redirect:/products";
	}
	@GetMapping("products/update")
	public String updateProductForm(@RequestParam("id") int id, Model model) {
//		Product product = this.products.stream()
//					.filter(p->p.getId()==id)
//					.limit(1)
//					.collect(Collectors.toList())
//					.get(0);
		Product product = this.productRepo.findById(id).get();
		//System.out.println(product);
		model.addAttribute("product",product);
		return "UpdateProductForm";
					
	}
	
	@PostMapping("products/update")
	public String updateProduct(@ModelAttribute Product product
							) {
		//Product product = new Product(name, manufacturer, unitPrice, isActive);
		//System.out.println(product);
//		this.products = (ArrayList<Product>) this.products.stream()
//			    .map(o -> o.getId() == product.getId() ? product : o)
//			    .collect(Collectors.toList());
//		
		this.productRepo.save(product);
		return "redirect:/products";
	}
	@GetMapping("products/delete")
	public String deleteProduct(@RequestParam("id") int id
							) {
		//Product product = new Product(name, manufacturer, unitPrice, isActive);
		//System.out.println(product);
		this.products =  (ArrayList<Product>) this.products.stream()
			    .filter(o->o.getId()!=id)
			    .collect(Collectors.toList());
		
		return "redirect:/products";
	}
}
