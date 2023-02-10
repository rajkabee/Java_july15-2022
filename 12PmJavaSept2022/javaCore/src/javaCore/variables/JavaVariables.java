package javaCore.variables;

import java.util.Scanner;

public class JavaVariables {
	public static void main(String[] args) {
		System.out.println("What is your name?");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("How old are you?");
		int age = sc.nextInt();
		
		System.out.println("hello, "+name+" of "+age);
		//System.out.println(String.format("hello, %s of %d", name, age));
		
		byte b = 127;
		short s = 32767;
		int i = 2147483647;
		long l = 9223372036854775807l;
		
		float f = 1.234f;
		double d = 3.24342;
		
		char c = 'r';
		
		boolean isOk = true;
		
		
		
		/*
		variables
		integer
			byte
			short
			int
			long
		float
			float
			double
		character
			char
		Boolean
			boolean
		
		*/
	}
}
