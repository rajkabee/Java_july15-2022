package com.examples.j2se.functions;

import java.util.Scanner;

public class Functions {
	
	public static void main(String[] args) {
		int a=7, b=5, sum;
		sum=add(a,b);
		System.out.println("Sum: "+sum);
		subtract(a,b);
		float phi = pi();
		System.out.println("PI: "+phi);
		product();
	}

	private static void product() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a= sc.nextInt();
		int b=sc.nextInt();
		int p = a*b;
		System.out.println("Product: "+p);
		
	}

	static int add(int x, int y){
		int c;
		c= x+y;
		return c;
	}
	static void subtract(int a, int b){
		int res = a-b;
		System.out.println("result: "+res);
	}
	static float pi() {
		return 3.1415f;
		//System.out.println("Value of pi sent!");
	}
}

/*
 
 syntax:
 return_type function_name(args[]){
 	statement block
 	return statement;
 }
 
 */
