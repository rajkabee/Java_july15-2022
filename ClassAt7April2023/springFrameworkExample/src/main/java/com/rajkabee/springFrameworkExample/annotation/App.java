package com.rajkabee.springFrameworkExample.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("annotations.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Student sts = context.getBean("sts", Student.class);
		System.out.println(sts);
		
		Student student = context.getBean("pupil", Student.class);
		System.out.println(student);
		
		Laptop lp = context.getBean("laps", Laptop.class);
		System.out.println(lp);
		
	}
}
