package com.rajkabee.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
	
	@GetMapping("/")
	public String index() {
		return "index.html";
	}
	@GetMapping("/user")
	public String user() {
		return "user.html";
	}
	@GetMapping("/admin")
	public String admin() {
		return "admin.html";
	}
	
}
