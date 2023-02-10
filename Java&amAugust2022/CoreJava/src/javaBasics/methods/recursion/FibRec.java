package javaBasics.methods.recursion;

import java.util.Scanner;

public class FibRec {
	public static void main(String[] args) {
		System.out.println("Enter the place value: ");
		int n = new Scanner(System.in).nextInt();
		int value = fib(n-1);
		System.out.println(n+"th fibonacci value: "+value);
	}

	private static int fib(int n) {
		if(n<2) {
			return n;
		}
		
		return fib(n-1)+fib(n-2);
	}
}
