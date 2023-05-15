package com.examples.j2se.functions;

import java.util.Scanner;

public class Recursion {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//int res = sum(num);
		//System.out.println("Sum: "+res);
		int res = sumOfDigits(num);
		System.out.println(res);
		res=decToBin(num);
		System.out.println("Binary Value: "+res);
	}

	private static int sum(int n) {
		if(n==0) {
			return 0;
		}
		return n+sum(n-1);
	}
	
	static int sumOfDigits(int num) {
		if(num<10) {
			return num;
		}
		return num%10 + sumOfDigits(num/10);
	}
	static int decToBin(int dec) {
		if(dec==0) {
			return 0;
		}	
		return decToBin(dec/2)*10+dec%2;
	}
	
	
}
/* 
 
 19
 d2b(9)*10+1;
 (d2b(4)*10+1)*10+1
 ((d2b(2)*10+0)*10+1)*10+1
 (((d2b(1)*10+0)*10+0)*10+1)*10+1
 ((((d2b(0)*10+1)*10+0)*10+0)*10+1)*10+1
 10011
 



/*
 
 sum(3)
 3+sum(2)
 3+2+sum(1)
 3+2+1+sum(0)
 3+2+1+0
 6
 */
 
