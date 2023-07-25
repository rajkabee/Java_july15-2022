package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/helloClient2")
	public String hello() {
		String msg = restTemplate.getForObject("http://client1/hello", String.class);
		return "Client 1 says: "+msg;
	}
	
	@GetMapping("/getProduct")
	public Product getProduct() {
		Product pd = restTemplate.getForObject("http://client1/product", Product.class);
		return pd;
	}
	
	
}
