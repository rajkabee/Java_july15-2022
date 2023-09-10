package com.rajkabee.j2se.oop.abstraction;

public class HireLogger implements Logger{

	@Override
	public void before() {
		System.out.println("Check Background...");
	}

	@Override
	public void after() {
		System.out.println("Give Responsibilities...");
	}
	
}
