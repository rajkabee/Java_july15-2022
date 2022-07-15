package com.example.annotationConfigWithoutXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.properties")
public class AppConfig {
	@Bean
	public User getUser() {
		return new User(2,"@Bean","Used", 9945647367l);
	}
	@Bean(name="user2")
	public User getUser2() {
		return new User(2,"@Bean2","Used2", 9945647367l);
	}
	@Bean(name="role2")
	public Role getRole() {
		return new Role(2, "User");
	}
	
}
