package com.rajkabee.j2se.methods;

import java.util.Scanner;

public class RecursiveSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int res = sum(num);
		System.out.println("Result: "+res);
	}

	private static int sum(int num) {
		if(num<=0) {
			return 0;
		}
		return num+sum(num-1);
	}
	
}
