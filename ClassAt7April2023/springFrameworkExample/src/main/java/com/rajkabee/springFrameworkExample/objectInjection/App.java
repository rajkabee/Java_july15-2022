package com.rajkabee.springFrameworkExample.objectInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Student st = context.getBean("st", Student.class);
		System.out.println(st);
		Laptop laptop = context.getBean("laptop", Laptop.class);
		System.out.println(laptop);
		Student std = context.getBean("std", Student.class);
		System.out.println(std);
	}
}
