package com.spring.springExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ObjectInjection {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("objectInjection.xml");
		//Category cat  = (Category)context.getBean("electronics");
		//System.out.println(cat);
		Product pd = (Product)context.getBean("smartWatch");
		System.out.println(pd);
	}
}
