package com.dursikshya.springBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class SpringBootWithThymeleaf1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithThymeleaf1Application.class, args);
	}

}
