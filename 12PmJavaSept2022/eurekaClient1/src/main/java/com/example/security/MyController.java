package com.example.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Greetings, Welcome to microservice architecture";
	}
	
	@GetMapping("/getUser")
	public User getUser() {
		User user =  new User(1, "Dawa" , "Password");
		return user;
	}
	
}
