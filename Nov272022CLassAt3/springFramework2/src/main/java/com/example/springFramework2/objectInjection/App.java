package com.example.springFramework2.objectInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/example/springFramework2/objectInjection/context.xml");
		Student st = (Student)context.getBean("student");
		Laptop lp = (Laptop)context.getBean("laptop");
		//st.setLaptop(lp);
		System.out.println(st);
		
		Student std = (Student)context.getBean("pupil");
		System.out.println(std);
	}
	
}
