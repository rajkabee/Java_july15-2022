package com.rajkabee.springIOC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.rajkabee.springIOC")
@PropertySource("application.properties")
public class SpringConfig {
	@Bean(name="cat")
	public Category getCategory(){
		return new Category(2, "Bakery Items");
	}
	
}
