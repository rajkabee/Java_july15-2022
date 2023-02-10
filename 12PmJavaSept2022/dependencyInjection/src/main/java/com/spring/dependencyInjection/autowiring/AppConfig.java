package com.spring.dependencyInjection.autowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.spring.dependencyInjection.autowiring")
public class AppConfig {
	@Bean(name="alina")
	public User getUser() {
		return new User(123, "Alina", "Kavre");
	}
	
	@Bean(name="cameraman")
	public Job getJob() {
		return new Job("Camera Man", 60000f);
	}
	
}
