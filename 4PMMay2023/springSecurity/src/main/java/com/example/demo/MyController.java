package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("")
	public String home() {
		return "<h1>Home Page</h1>";
	}
	@GetMapping("/user")
	public String user() {
		return "<h1>Users' Page</h1>";
	}
	@GetMapping("/admin")
	public String admin() {
		return "<h1>Admins' Page</h1>";
	}
	
}
