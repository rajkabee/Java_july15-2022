package com.dursikshya.coreJava.loops;

import java.util.Scanner;

public class Primes {
	public static void main(String[] args) {
		System.out.println("Enter the range: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i,j;
		for(i=2; i<=num; i++) {
			for(j=2; j<=i/2; j++) {
				if(i%j==0) {
					break;
				}
			}
			if(j==(i/2)+1) {
				System.out.print(i+", ");
			}
		}
	}
}
