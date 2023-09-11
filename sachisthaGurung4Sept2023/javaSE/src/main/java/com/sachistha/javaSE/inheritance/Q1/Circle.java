package com.sachistha.javaSE.inheritance.Q1;

public class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("A Circle is drawn!");
	}
	@Override
	public void erase() {
		System.out.println("The Circle is erased!");
	}
}
