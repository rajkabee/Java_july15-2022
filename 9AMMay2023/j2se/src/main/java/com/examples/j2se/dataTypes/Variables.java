package com.examples.j2se.dataTypes;

import java.util.Scanner;

public class Variables {
	public static void main(String[] args) {
		byte b;
		b=127;
		System.out.println("Byte b: "+b);
		System.out.println(String.format("Byte b: %d", b));
		System.out.println("How old are you?");
		Scanner sc = new Scanner(System.in);
		//b=sc.nextByte();
		System.out.println("you are "+b+"years old!");
		short s = 32767;
		int i = 2140000000;
		long l =9220000000000000000l;
		System.out.println("Long l: "+l);
		float f = 1.234f;
		System.out.println("Float f: "+f);
		double d=1.2344431;
		char ch='r';
		boolean bool = true;
		
		
		
	}
}
