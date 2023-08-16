package com.rajkabee.j2se.methods;

import java.util.Scanner;

public class Reversed {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int rev = reverse(num);
		System.out.println("Reverse: "+rev);
		if(num==rev) {
			System.out.println("the number is a Palindrome!");
		}
	}

	private static int reverse(int n) {
		int rev=0, rem;
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}
}
