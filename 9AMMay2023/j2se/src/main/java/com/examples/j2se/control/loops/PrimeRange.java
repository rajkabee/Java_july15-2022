package com.examples.j2se.control.loops;

import java.util.Scanner;

public class PrimeRange {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of the prime numbers: ");
		int range=sc.nextInt();
		for(n=0; n<=range; n++) {
			if(n>=2) {
				int i;
				for(i=2; i<=n/2; i++) {
					if(n%i==0) {
						break;
					}
				}
				if(i==(n/2+1)) {
					System.out.println(n);
				}
			
			}
		}
		
	}
}
