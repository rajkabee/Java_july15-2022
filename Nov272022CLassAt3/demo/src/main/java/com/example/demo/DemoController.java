package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class DemoController {
	@RequestMapping("/home")
	//@ResponseBody
	public String home() {
		return "index.html";
	}
	
	
	@GetMapping("/hello")
	public String greet(@RequestParam("name")
						String username
							) {
		return "Hello "+username+", Welcome to my first springBoot web app";
	}
	
	@PostMapping("/hello")
	public String greetings(@RequestParam("name")
						String username
							) {
		return "Hello "+username+", Welcome to my first springBoot web app. "+"you made a post request.";
	}
	
	
	
	
	
}
