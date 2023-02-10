package myFirstJavaProject.methods;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int a=123;
		int b=546;
		int sum = add(a,b);
		System.out.println("Sum: "+sum);
		diff(a,b);
		multiply();
		System.out.println("pi: "+pi());
	}
	//no argument but return type method
	private static float pi() {
		return 3.1415f;
	}
	//no argument no return type method
	private static void multiply() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int p = sc.nextInt();
		int q = sc.nextInt();
		System.out.println("Product: "+p*q);
	}
	//argumented but no return type method
	private static void diff(int a, int b) {
		int difference = a-b;
		System.out.println("Difference: "+difference);
		
	}
	//argumented and return type method
	static int add(int x, int y) {
		return x+y;
	}
	
	
	
}
