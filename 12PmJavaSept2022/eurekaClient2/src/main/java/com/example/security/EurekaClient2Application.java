package com.example.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class EurekaClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClient2Application.class, args);
	}
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/hi")
	public String hi() {
		return restTemplate.getForObject("http://localhost:8762/hello", String.class);
	}
	
	@GetMapping("/getUserFromClient1")
	public String getUserFromClient1() {
		User user = restTemplate.getForObject("http://localhost:8762/getUser", User.class);
		System.out.println(user);
		return user.toString();
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
