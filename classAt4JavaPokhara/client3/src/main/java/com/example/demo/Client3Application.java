package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.DiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@RestController

public class Client3Application {

	public static void main(String[] args) {
		SpringApplication.run(Client3Application.class, args);
	}
	@RequestMapping("/hello")
	public String hello() {
		return "Hello from Client3";
	}

}

