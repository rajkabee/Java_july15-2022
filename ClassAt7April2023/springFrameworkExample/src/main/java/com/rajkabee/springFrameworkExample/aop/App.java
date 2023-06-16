package com.rajkabee.springFrameworkExample.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigAop.class);
		Operation op = context.getBean("operation", Operation.class);
		op.task1();
		op.task2();
		op.task3("hello", 43);
	}
}
