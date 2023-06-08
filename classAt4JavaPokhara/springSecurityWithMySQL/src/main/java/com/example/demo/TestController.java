package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@Autowired
	MyUserDetailsService myUserDetailsService;
	
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
	@RequestMapping("/addUsers")
	public String addUsers() {
		myUserDetailsService.addUsers();
		return "users added to the database";
	}
	
}
