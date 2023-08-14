package com.rajkabee.j2se.loops;

import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n =sc.nextInt();
		int i=0;
		while(n>0) {
			i++;
			n/=10;
		}
		System.out.println("no of digits: "+i);
		
	}
}
