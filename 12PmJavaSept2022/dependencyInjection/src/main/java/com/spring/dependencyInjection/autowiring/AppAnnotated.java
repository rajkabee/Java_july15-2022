package com.spring.dependencyInjection.autowiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AppAnnotated {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	
		//User alina = (User)context.getBean("getUser");
		User alina = (User)context.getBean("user");		
		System.out.println(alina);
	}
}
