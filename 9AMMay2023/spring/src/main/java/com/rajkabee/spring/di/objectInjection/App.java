package com.rajkabee.spring.di.objectInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("objectinjection.xml");
		Product product = (Product)ctx.getBean("product");
		System.out.println(product);
		Product pd = (Product)ctx.getBean("pd");
		System.out.println(pd);
	}
}
