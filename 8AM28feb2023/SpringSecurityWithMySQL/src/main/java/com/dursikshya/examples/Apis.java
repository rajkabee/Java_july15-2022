package com.dursikshya.examples;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Apis {
	@GetMapping
	public String dummy() {
		return "<h1>Index Page</h1>";
	}
	
	
	@GetMapping("/home")
	public String home() {
		return "<h1>HOME PAGE</h1>";
	}
	
	@GetMapping("/user")
	public String user() {
		return "<h1>USER'S PAGE</h1>";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "<h1>ADMIN'S PAGE</h1>";
	}
}
