package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@RequestMapping("/home")
	public String home() {
		return "<h1>Home Page</h1>";
	}
	@RequestMapping("/user")
	public String user() {
		return "This is user's page";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "This is admin's page";
	}
	
}
