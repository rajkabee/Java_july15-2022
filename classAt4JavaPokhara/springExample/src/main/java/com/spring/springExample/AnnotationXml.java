package com.spring.springExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationXml {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("annotationConfig.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
		Category cat1 = context.getBean("category", Category.class);
		System.out.println(cat1);
		Product pd = (Product)context.getBean("pd");
		System.out.println(pd);
		Category cat2 = context.getBean("cat", Category.class);
		System.out.println(cat2);
		
	}
}
