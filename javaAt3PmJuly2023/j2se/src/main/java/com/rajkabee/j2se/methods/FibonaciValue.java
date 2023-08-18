package com.rajkabee.j2se.methods;

import java.util.Scanner;

public class FibonaciValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: " );
		int n = sc.nextInt();
		int val = fib(n);
		System.out.println(n+"th fibonacci value: "+val);
	}

	private static int fib(int n) {
		if(n==1) {
			return 0;
		}
		else if(n==2) {
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}
}
