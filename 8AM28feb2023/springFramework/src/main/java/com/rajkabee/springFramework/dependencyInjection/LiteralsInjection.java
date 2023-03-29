package com.rajkabee.springFramework.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LiteralsInjection {
	public static void main(String[] args) {
		//Product p = new Product();
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Product car = (Product) context.getBean("car");
		System.out.println(car);
		Product bike = (Product) context.getBean("bike");
		System.out.println(bike);
		
		//Category cat = context.getBean(Category.class);
		Category cat = (Category)context.getBean("jeans");
		System.out.println(cat);
	}
}
