package com.dursikshya.springBootDemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	
	@RequestMapping("/users")
	public String getUsers() {
		return "users";
	}
	@RequestMapping("/admin")
	public String getAdmin() {
		return "admin";
	}
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
