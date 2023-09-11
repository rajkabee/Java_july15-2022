package com.sachistha.javaSE.inheritance.Q1;

public class Triangle extends Shape{
	@Override
	public void draw() {
		System.out.println("A Triangle is drawn!");
	}
	@Override
	public void erase() {
		System.out.println("The Triangle is erased!");
	}
}
