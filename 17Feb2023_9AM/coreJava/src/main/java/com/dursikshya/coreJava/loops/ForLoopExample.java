package com.dursikshya.coreJava.loops;

import java.util.Scanner;

public class ForLoopExample {
	public static void main(String[] args) {
		int i;
		
		for(i=0;i<5;i++) {
			System.out.println("For Loop Example");
			
		}
		
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		int product=1;
		int sum=0;
		for(i=1; i<=num; i++) {
			sum+=i;
			product*=i;
		}
		System.out.println("Sum of "+num+" natural numbers: "+sum);
		System.out.println("Factorial of "+num+": "+product);
		
		
		
		
		/*
		 * 
		 * for(init, con, iter){
		 * 		work to be repeated
		 * }
		 */
	}
}
