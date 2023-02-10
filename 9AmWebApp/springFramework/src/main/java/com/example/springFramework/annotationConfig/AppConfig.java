package com.example.springFramework.annotationConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.example.springFramework.annotationConfig")
@PropertySource("application.properties")
public class AppConfig {
	@Bean(name="frame")
	public Product getProduct() {
		return new Product(5643, "decorative frame", 13221.12321f);
	}
	
}
