package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserController {
	
	@RequestMapping("/user/{username}")
	public String hello( @PathVariable("username") String username) {
		return "hello, " + username+". welcome to User Management Appplication";
	}
}
