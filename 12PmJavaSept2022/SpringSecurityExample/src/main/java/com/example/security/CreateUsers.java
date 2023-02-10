package com.example.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.security.entity.User;
import com.example.security.repositories.UserRepository;

@Controller
public class CreateUsers {
	@Autowired
	UserRepository userRepository;
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@GetMapping("/createUsers")
	public String addUsers() {
		User user = new User(1, "user", encodePassword("password"), "ROLE_USER", true);
		User manager = new User(1, "admin", encodePassword("password"), "ROLE_USER", true);
		User admin = new User(1, "admin", encodePassword("password"), "ROLE_USER", true);
		userRepository.save(user);
		userRepository.save(manager);
		userRepository.save(admin);
		return "home";
		
	}
	
	String encodePassword(String password) {
		return passwordEncoder.encode(password);
	}
}
