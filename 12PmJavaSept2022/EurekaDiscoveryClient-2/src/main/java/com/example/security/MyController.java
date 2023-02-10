package com.example.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class MyController {
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/hiClient1")
	public String hiClient1() {
		return restTemplate.getForObject("http://spring-cloud-eureka-client/greeting", String.class);
	}
}
