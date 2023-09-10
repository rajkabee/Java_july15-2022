package com.rajkabee.j2se.oop.polymorphism;

public class Polymorphism {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("Result: "+calc.add(23,54));;
		System.out.println("Result: "+calc.add(23,34,45));;
	}
}
