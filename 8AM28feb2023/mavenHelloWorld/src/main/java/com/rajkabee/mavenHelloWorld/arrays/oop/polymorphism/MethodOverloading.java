package com.rajkabee.mavenHelloWorld.arrays.oop.polymorphism;

public class MethodOverloading {
	public static void main(String[] args) {
		int a=5, b=7, c=4, res;
		res=add(a,b);
		System.out.println("a+b="+res);
		res=add(a,b,c);
		System.out.println("a+b+c="+res);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	private static int add(int a, int b, int c) {
		int sum=a+b+c;
		return sum;
	}

	private static int add(int a, int b) {
		int sum=a+b;
		return sum;
	}
}
