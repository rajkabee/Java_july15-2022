package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("")
	public String home() {
		return "<h1>Home Page</h1>";
	}
	
	@RequestMapping("/user")
	public String user() {
		return "<h1>User's Page</h1>";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "<h1>Admin's Page</h1>";
	}
}
