package com.rajkabee.spring.di.objectInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/rajkabee/spring/di/objectInjection/context.xml");
		Student st = ctx.getBean("student", Student.class);
		Student sts = ctx.getBean("sts", Student.class);
		System.out.println(st);
		System.out.println(sts);
	}
}
