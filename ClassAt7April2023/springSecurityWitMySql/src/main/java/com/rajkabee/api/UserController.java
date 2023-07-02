package com.rajkabee.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@Autowired
	UserRepository userRepo;
	@Autowired
	PasswordEncoder encoder;
	
	@RequestMapping("/addUsers")
	public String AddUsers() {
		userRepo.save(new User(0, "moderator", encoder.encode("password"), "ROLE_ADMIN", true));
		userRepo.save(new User(0, "staff", encoder.encode("password"), "ROLE_USER", true));
		return "index.html";
	}
}	
