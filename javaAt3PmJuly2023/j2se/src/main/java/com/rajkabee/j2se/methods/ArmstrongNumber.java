package com.rajkabee.j2se.methods;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int av = armstrong(num);
		if(num==av) {
			System.out.println("Armstrong Number!");
		}
		else {
			System.out.println("Not a Armstrong Number!");
		}
	}

	private static int armstrong(int num) {
		int digits = digits(num);
		int digit, av=0;
		while(num>0) {
			digit = num%10;
			av+=power(digit, digits);
			num/=10;
		}
		return av;
	}
	static int digits(int num) {
		if(num<=0) {
			return 0;
		}
		return 1+digits(num/10);
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
