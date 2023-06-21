package com.rajkabee.spring.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "com.rajkabee.spring.annotations")
public class SpringConfig {
	
	@Bean(name="dataAccessObject")
	public Dao getDao() {
		return new Dao("url", "driver", "username", "password");
	}
	
}
