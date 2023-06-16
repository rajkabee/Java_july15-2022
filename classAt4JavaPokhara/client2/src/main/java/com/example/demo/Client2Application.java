package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class Client2Application {

	public static void main(String[] args) {
		SpringApplication.run(Client2Application.class, args);
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello from client2";
	}
	
//	@Bean
//	public RestTemplate restTemplate() {
//		return new RestTemplate();
//	}
	
	@RequestMapping("/helloclient1")
	public String helloClient1() {
		RestTemplate rt = new RestTemplate();
		String msg = rt.getForObject("http://localhost:8762/hello", String.class);
		return msg;
	}
}
