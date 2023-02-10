package com.example.springFrameworkDI.annotationConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.properties")
@ComponentScan(basePackages = "com.example.springFrameworkDI.annotationConfig")
public class ApplicationConfiguration {
	@Bean(name="myCourse")
	public Course getCourse() {
		return new Course();
	}
	@Bean(name="mathematics")
	public Category getCategory() {
		return new Category(123, "Mathemetics");
	}
	@Bean(name="literature")
	public Category getaCategory() {
		return new Category(321, "Literature");
	}
	
}
