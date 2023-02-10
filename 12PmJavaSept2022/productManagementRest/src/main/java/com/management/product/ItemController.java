package com.management.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.product.entity.Item;

@RestController
@RequestMapping("/items")
public class ItemController {
	@Autowired
	ItemRepository itemRepo;
	
	@GetMapping("/")
	public List<Item> getItems() {
		return itemRepo.findAll();
	}
	@PostMapping("/")
	public Item addItem(@ModelAttribute Item item) {
		return this.itemRepo.save(item);
	}
}
