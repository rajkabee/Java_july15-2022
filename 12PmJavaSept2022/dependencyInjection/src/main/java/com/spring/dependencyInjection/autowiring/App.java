package com.spring.dependencyInjection.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/dependencyInjection/autowiring/autowiring.xml"
				);
		System.out.println(context.getBean("sanjay"));
	}
}
