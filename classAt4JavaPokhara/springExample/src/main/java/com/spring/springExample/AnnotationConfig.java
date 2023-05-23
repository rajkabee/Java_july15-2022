package com.spring.springExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages="com.spring.springExample")
public class AnnotationConfig {
	@Bean(name="cat")
	public Category getCategory() {
		return new Category(1234, "hello");
	}
	
}
