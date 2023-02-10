package com.spring.dependencyInjection.annotationConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("com/spring/dependencyInjection/annotationConfig/application.properties")
@ComponentScan(basePackages = "com.spring.dependencyInjection.annotationConfig")
public class AppConfig {
	@Bean(name="alina")
	public User getUser() {
		return new User(123, "Alina", "Kavra");
	}
	
}
