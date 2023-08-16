package com.rajkabee.j2se.methods;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		boolean isPerfect = perfect(num);
		if(isPerfect) {
			System.out.println("Perfect Number!");
		}
		else {
			System.out.println("Not a Perfect Number!");
		}
	}

	private static boolean perfect(int num) {
		int sum=0;
		for(int i=1; i<num; i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(sum==num) {
			return true;
		}
		return false;
	}
}
