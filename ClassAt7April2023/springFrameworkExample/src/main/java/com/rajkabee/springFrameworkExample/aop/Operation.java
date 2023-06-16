package com.rajkabee.springFrameworkExample.aop;

import org.springframework.stereotype.Component;

@Component
public class Operation {
	public void task1() {
		System.out.println("Task1 on progress...");
	}
	public void task2() {
		System.out.println("Task2 on progress...");
	}
	public void task3(String name, int age) {
		System.out.println("Task3 on progress...");
	}
}
