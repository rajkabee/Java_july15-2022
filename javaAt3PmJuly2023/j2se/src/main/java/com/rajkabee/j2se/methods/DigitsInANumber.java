package com.rajkabee.j2se.methods;

import java.util.Scanner;

public class DigitsInANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int dig = digits(num);
		System.out.println("No. of digits in "+num+": "+dig);
	}

	static int digits(int num) {
		int i=0;
		while(num>0) {
			i++;
			num/=10;
		}
		return i;
	}
	
}
