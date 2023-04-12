package com.rajkabee.springFramework.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//implements InitializingBean, DisposableBean
@Component
public class Product{
	int id;
	String name;
	String manufacturer;
	float price;
	@PreDestroy
	public void destroy() {
		System.out.println("Product Bean Destroyed!");
	}
	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		System.out.println("Product Bean instantiated!");	
	}
	
}
