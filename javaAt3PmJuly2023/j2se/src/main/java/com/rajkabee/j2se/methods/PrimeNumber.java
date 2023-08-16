package com.rajkabee.j2se.methods;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		if(num<2) {
			System.out.println("Neither Prime nor Composite!");
		}
		else {
			boolean isPrime=prime(num);
			if(isPrime) {
				System.out.println("Prime Number!");
			}
			else {
				System.out.println("Composite Number!");
			}
		}
	}

	private static boolean prime(int num) {
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
