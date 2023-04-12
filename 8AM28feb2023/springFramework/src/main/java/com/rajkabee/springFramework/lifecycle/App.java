package com.rajkabee.springFramework.lifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = "com.rajkabee.springFramework.lifecycle")
public class App {
	public static void main(String[] args) {
		//ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		
		Product p = (Product)context.getBean("product");
		System.out.println(p);
		context.close();
	}
}
