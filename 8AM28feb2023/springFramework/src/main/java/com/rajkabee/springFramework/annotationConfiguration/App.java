package com.rajkabee.springFramework.annotationConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigutation.class);
		//ApplicationContext context = new  ClassPathXmlApplicationContext("annotationConfiguration.xml");
		//Product p= context.getBean(Product.class);
		//Product p= (Product)context.getBean("pd");
		Product p= (Product)context.getBean("product");
		System.out.println(p);
		
	}
}
