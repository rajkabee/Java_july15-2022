package com.rajkabee.j2se.methods;

import java.util.Scanner;

public class PowerEval {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base: ");
		int b = sc.nextInt();
		System.out.println("Enter the power: ");
		int p = sc.nextInt();
		int result = power(b,p);
		System.out.println("Result: "+result);
	}
	private static int power(int b, int p) {
		int res=1;
		while(p>0) {
			res*=b;
			p--;
		}
		return res;
	}
}
