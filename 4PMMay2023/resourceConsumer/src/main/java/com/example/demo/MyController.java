package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/helloResourceProvider")
	public String hello() {
		String msg = restTemplate.getForObject("http://resourceProvider/hello", String.class);
		return "Resource Provier says: "+msg;
	}
}
