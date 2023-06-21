package com.rajkabee.api;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.mapping.ExposureConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.rajkabee.api.entities.Product;
@Configuration
public class RestResourceConfigure implements RepositoryRestConfigurer{
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
		// TODO Auto-generated method stub
		config.exposeIdsFor(Product.class);
		RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config, cors);
		ExposureConfiguration exconfig = config.getExposureConfiguration();
		

	}
	
}
