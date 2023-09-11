package com.sachistha.javaSE.inheritance.Q1;

public class Square extends Shape{
	@Override
	public void draw() {
		System.out.println("A Square is drawn!");
	}
	@Override
	public void erase() {
		System.out.println("The Square is erased!");
	}
}
