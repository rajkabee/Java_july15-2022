package com.rajkabee.springFrameworkExample.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Logger {
//	@Before("execution(public void task())")
//	@Before("execution(public void task*())")
//	@Before("execution(public void com.rajkabee.springFrameworkExample.aop.Operation.task*())")
//	@Before("execution(public void com.rajkabee.springFrameworkExample.aop.*.task*())")
//	@Before("execution(public * task*())")
	@Before("execution(public * task*(*,*))")
//	@Before("execution(public * task*(..))")
	void loggerBeforeTask(){
		System.out.println("Task started!");
	}
	
	
	@After("execution(public void task*())")
	void loggerAfterTask(){
		System.out.println("Task Ended!\n");
	}
}
