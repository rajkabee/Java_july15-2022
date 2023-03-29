package com.dursikshya.coreJava.loops;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int dig=0;
		int t=num;
		while(t!=0) {
			t/=10;
			dig++;
		}
		//System.out.println(dig);
		t=num;
		int rem, i, pow, armVal=0;
		while(t!=0) {
			rem=t%10;
			pow=1;
			i=0;
			while(i<dig) {
				pow*=rem;
				i++;
			}
			armVal+=pow;
			t/=10;
		}
		
		//System.out.println(armVal);
		if(num==armVal) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not a Armstrong Number");
		}
		
	}
}
