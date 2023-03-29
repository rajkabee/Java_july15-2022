package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	
	@GetMapping("/user")
	public String user() {
		return "<h1>User's Page</h1>";
	}
	@GetMapping("/admin")
	public String admin() {
		return "<h1>Admin's Page</h1>";
	}
	
	
	
}
