package com.springAop;

import org.springframework.stereotype.Component;

@Component
public class Operation {
	public void task1() {
		System.out.println("Working on task one...");
	}
	public void task2(String name) {
		System.out.println(name+" Working on task two...");
	}
	public void task3() {
		System.out.println("Working on task three...");
	}
}
 