package com.spring.dependencyInjection.annotationConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		User user = (User)context.getBean("user");
		System.out.println(user);
		//User alina = (User)context.getBean("getUser");
		User alina = (User)context.getBean("alina");		
		System.out.println(alina);
	}
}
