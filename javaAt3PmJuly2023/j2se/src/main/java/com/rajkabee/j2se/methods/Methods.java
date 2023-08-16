package com.rajkabee.j2se.methods;

import java.util.Scanner;

public class Methods {
	public static void main(String[] args) {
		int a=5, b=7, result;
		result=add(a,b);
		System.out.println("Sum: "+result);
		//int a,b;
		subtract(a,b);
		float pie = pi();
		System.out.println("Pi: "+pie);
		multiply();
	}
	private static void multiply() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int p=a*b;
		System.out.println("Product: "+p);
		
	}
	static void subtract(int a, int b) {
		int diff;
		diff=a-b;
		System.out.println("Difference: "+diff);
	}
	static int add(int x, int y){
		int c;
		c=x+y;
		return c;
	}
	static float pi() {
		return 3.1415f;
	}
	
}
