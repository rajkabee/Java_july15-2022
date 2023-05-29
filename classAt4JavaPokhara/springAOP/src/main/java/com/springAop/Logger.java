package com.springAop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Aspect
@Component
public class Logger {
//	@Before("execution(public void task1())")
//	@Before("execution(public void task*())")
//	@Before("execution(public void com.springAop.Operation.task*())")
//	@Before("execution(public void com.springAop.*.task*())")
//	@Before("execution(public * task*())")
//	@Before("execution(public * task*(*))")
	@Before("execution(public * task*(..))")
	public void logBeforeTask() {
		System.out.println("Task Started...");
	}
	
	@After("execution(public * task*(..))")
	public void logEndTask() {
		System.out.println("task ended...");
	}
	
}
