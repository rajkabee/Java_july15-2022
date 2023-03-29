package com.dursikshya.coreJava.loops;

import java.util.Scanner;

public class ReversePalidrome {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = n;		//1234
		int rev=0, rem;
		while(t!=0) {
			rem=t%10;		//4
			rev=rev*10+rem;		//4
			t/=10;
		}
		System.out.println("Reverse: "+rev);
		if(rev==n) {
			System.out.println("palindrome");
		}
		
	}
}
