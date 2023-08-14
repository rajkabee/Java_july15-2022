package com.rajkabee.j2se.loops;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int factorial=1;
		while(n>0) {
			factorial*=n;
			n--;
		}
		
//		int i=1;
//		while(i<=n) {
//			factorial=factorial*i;
//			i++;
//		}
//		for(int i=1; i<=5; i++) {
//			factorial*=i;
//		}
		System.out.println("Factorial: "+factorial);
		
		
	}
}
