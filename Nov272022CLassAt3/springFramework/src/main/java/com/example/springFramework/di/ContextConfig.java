package com.example.springFramework.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.example.springFramework.di")
@PropertySource("application.properties")
public class ContextConfig {
	@Bean(name="chitwan")
	public Address getAddress() {
		return new Address(543, "", "Chitwan");
	}
	
	@Bean(name="ktm")
	public Contact getContact() {
		return new Contact(432, null, "34543234");
	}
}
