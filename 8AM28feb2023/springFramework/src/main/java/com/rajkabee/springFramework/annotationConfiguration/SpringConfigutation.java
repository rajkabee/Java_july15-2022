package com.rajkabee.springFramework.annotationConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "com.rajkabee.springFramework.annotationConfiguration")
public class SpringConfigutation {
	
	@Bean(name = "pd")
	Product getProduct() {
		return new Product(123, "ipad", "apple", 1500f, true) ;
	}
	@Bean(name="cat")
	Category getCategory() {
		return new Category(456, "Tablets");
	}
	
	
}
