package com.rajkabee.springFrameworkExample.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowiring.xml");
		
//		Laptop laptop = context.getBean("dell", Laptop.class);
//		System.out.println(laptop);
		Student std = context.getBean("sudhir", Student.class);
		System.out.println(std);
	}
}
