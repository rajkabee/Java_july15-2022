package com.rajkabee.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ProducerClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducerClientApplication.class, args);
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello, Welcome to eureka discovery Client(Producer)";
	}

}
