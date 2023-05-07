package com.j2se.examples;

import java.util.Scanner;

public class DataTypesAndVariables {
	public static void main(String[] args) {
		byte b=23;//10000000=-128	01111111=127 range: -128to+127
		short s=32767;
		int i=2147483647;
		long l=123423456789l;
		System.out.println("byte b: "+b);
		System.out.println(String.format("Short s: %d", s));
		System.out.println("int i: "+i);
		System.out.println("long l: "+l);
		System.out.println("Enter your age: ");
		Scanner sc = new Scanner(System.in);
		byte age=sc.nextByte();
		System.out.println("You are "+age+" years old.");
		
		float f = 1.234f;
		double d = 1.234;
		
		char ch='u';
		System.out.println("char ch: "+ch);
		boolean active = false;
		System.out.println(active);
		
		
		
	}
}
