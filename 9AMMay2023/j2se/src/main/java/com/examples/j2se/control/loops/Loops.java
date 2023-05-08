package com.examples.j2se.control.loops;

import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		int n, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		int count=0;
		while(n>0) {
			count++;
			n/=10;
		}
		System.out.println("No. of digits: "+count);
		
		
		
		
		
		
		
		
		int product=1;
		i=1;
		while(i<=n) {
			product*=i;
			i++;
		}
		System.out.println("Factorial of "+n+": "+product);
		
		
		int sum=0;
//		for(i=0; i<=n; i++) {
//			sum+=i;
//		}
		i=0;
		while(i<=n) {
			sum+=i;
			i++;
		}
		System.out.println("Sum of "+n+" natural numbers: "+sum);
	}
}
