package com.examples.j2se.functions;

import java.util.Scanner;

public class PrimeFunc {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPrime = prime(n);
		if(isPrime) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Composite");
		}
	}

	private static boolean prime(int n) {
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
