package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/home")
	public String home() {
		return "this is home api called";
	}

	@RequestMapping("/user")
	public String user() {
		return "this is user api called";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "this is admin api called";
	}
	
}
