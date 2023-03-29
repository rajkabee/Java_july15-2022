package com.dursikshya.coreJava.loops;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum=0;//10
		int i=1;
		while(i<=num) {
			sum=sum+i;
			i++;
		}
		System.out.println("sum of "+num+" natural numbers: "+sum);
		
		
	}
}
