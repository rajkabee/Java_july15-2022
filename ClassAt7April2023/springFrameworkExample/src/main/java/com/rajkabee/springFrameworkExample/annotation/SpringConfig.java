package com.rajkabee.springFrameworkExample.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
//@ComponentScan(basePackages = "com.rajkabee.springFrameworkExample.annotation")
public class SpringConfig {
	
	@Bean(name="sts")
	public Student getStudentBean() {
		return new Student();
	}
	@Bean(name="laps")
	public Laptop getLaptopBean() {
		return new Laptop();
	}
}
