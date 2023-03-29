package com.rajkabee.mavenHelloWorld.loops;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i, flag=0;
		for(i=2; i<=num/2; i++) {
			if(num%i==0) {
				System.out.println("Composite");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Prime");
		}
	}
}
