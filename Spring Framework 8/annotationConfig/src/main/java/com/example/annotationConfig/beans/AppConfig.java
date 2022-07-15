package com.example.annotationConfig.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public User getUser() {
		return new User(2,"@Bean","Used", 9945647367l);
	}
	@Bean(name="user2")
	public User getUser2() {
		return new User(2,"@Bean2","Used2", 9945647367l);
	}
	
}
