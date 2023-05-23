package com.spring.springAOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class MyAdvice{
	@Before("execution(com.spring.springAOP.Person.display())")
	private void beforeMethod() {
		System.out.println("before method called!");

	}

}
