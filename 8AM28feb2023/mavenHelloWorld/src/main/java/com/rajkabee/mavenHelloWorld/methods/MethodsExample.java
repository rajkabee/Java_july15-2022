package com.rajkabee.mavenHelloWorld.methods;

import java.util.Scanner;

public class MethodsExample {
	
	public static void main(String[] args) {
		int a=5, b=7, c;
		c=add(a,b);
		System.out.println("Sum: "+c);
		subtract(a,b);
		multiply();
		int res = divide();
		System.out.println("Quotient: "+res);
	}
//	return_type	method_name(arguments) {
//		method_body;
//		return statement; optional
//	}
	
	private static int divide() {
		int x,y,q;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		x=sc.nextInt();
		y=sc.nextInt();
		q=x/y;
		return q;
	}

	private static void multiply() {
		int x,y,p;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		x=sc.nextInt();
		y=sc.nextInt();
		p=x*y;
		System.out.println("Product: "+p);
		
	}

	private static void subtract(int x, int y) {
		int z;
		z=x-y;
		System.out.println("Difference: "+z);
	}

	static int add(int a, int b){
		int c;
		c=a+b;
		return c;
	}
	
	
}
