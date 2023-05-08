package com.examples.j2se.control.loops;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		if(n<2) {
			System.out.println("neither prime nor composite!");
		}
		else {
			int i;
			for(i=2; i<=n/2; i++) {
				if(n%i==0) {
					break;
				}
				
			}
			if(i==(n/2+1)) {
				System.out.println("Prime!");
			}
			else {
				System.out.println("Composite!");
			}
		}
		
	}
}
