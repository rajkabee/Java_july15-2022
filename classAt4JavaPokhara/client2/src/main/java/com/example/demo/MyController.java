package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {
	@Autowired
	RestTemplate rt;
	
	@GetMapping("/helloClient1")
	public String helloClient1() {
		return rt.getForObject("http://client1/hello", String.class); 
	}
}
