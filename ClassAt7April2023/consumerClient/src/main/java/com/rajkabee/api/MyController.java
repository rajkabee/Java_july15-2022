package com.rajkabee.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {

	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/helloProducer")
	public String helloProducer() {
		return restTemplate.getForObject("http://producer/hello", String.class);
	}
	
}
