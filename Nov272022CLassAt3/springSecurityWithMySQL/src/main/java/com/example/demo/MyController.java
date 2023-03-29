package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/user")
	public String user() {
		return "<h1>User's Page</h1>";
	}
	@GetMapping("/admin")
	public String admin() {
		return "<h1>Admin's Page</h1>";
	}
	
	@GetMapping("/addUser/{username}")
	public String addUser(@PathVariable("username") String username) {
		User user = new User(username, passwordEncoder.encode(username), "ROLE_USER", true);
		userRepository.save(user);
		return "user added to the Database!";
		
	}
	
	
}
