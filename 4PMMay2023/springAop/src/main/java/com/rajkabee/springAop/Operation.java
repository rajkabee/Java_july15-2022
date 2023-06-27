package com.rajkabee.springAop;

import org.springframework.stereotype.Component;

@Component
public class Operation {
	public void task1() {
		System.out.println("Task1 Commenced...");
	}
	public void task1(String name) {
		System.out.println("Task1 Commenced by "+name);
	}
	public void task2() {
		System.out.println("Task2 Commenced...");
	}
}
