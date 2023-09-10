package com.example.springSecurity.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springSecurity.data.entity.User;
import com.example.springSecurity.repositories.UserRepository;


@RestController
public class MyController {
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
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
	
	@GetMapping("/createUsers")
	public String createUsers() {
		userRepo.save(new User("user", passwordEncoder.encode("password"), "ROLE_USER", true));
		userRepo.save(new User("admin", passwordEncoder.encode("password"), "ROLE_ADMIN", true));
		return "<h1>Users Cretaed!</h1>";
	}
	
	@GetMapping("/testApi")
	public String testApi() {
		return "This is a test api!";
	}
	
}
