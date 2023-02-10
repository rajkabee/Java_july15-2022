package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProductController {
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/getProduct")
	public String getProduct() {
		return "Chocolate";
	}
	@RequestMapping("/loggedInUser")
	public String getLoggenInUser() {
		String user = restTemplate.getForObject("http://UserManagement/getUser",String.class);
		return user;
	}
}
