package com.dursikshya.coreJava.loops;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		for(int i=1; i<n; i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(sum==n) {
			System.out.println("Perfect");
		}
		else {
			System.out.println("not a perfect");
		}
	}
	
}
