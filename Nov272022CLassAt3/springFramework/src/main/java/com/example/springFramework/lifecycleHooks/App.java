package com.example.springFramework.lifecycleHooks;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		//UserService userService1 = (UserService)context.getBean("userService");
		//UserService userService2 = (UserService)context.getBean("userService");
		//userService1.connectToDatabase();
		//userService2.users = Arrays.asList("John", "Joe", "Jack");
		//System.out.println(userService1.getUser(1));
		((AbstractApplicationContext) context).close();
	}
}
