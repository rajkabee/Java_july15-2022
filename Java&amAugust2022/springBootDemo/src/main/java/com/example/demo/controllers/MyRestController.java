package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apis")
public class MyRestController {
	@RequestMapping("/products/2")	
	public String products() {
		return "Mercedes Car";
	}
}
