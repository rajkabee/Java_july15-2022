package com.dursikshya.coreJava.loops;

import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr a number: ");
		num=sc.nextInt();
		int t = num;
		int dig=0;
		while(t!=0) {
			t/=10;
			dig++;
		}
		System.out.println("Number of digits in "+num+": "+dig);
		
	}
}
