package com.rajkabee.j2se.loops;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base: ");
		int b = sc.nextInt();
		System.out.println("Enter the power: ");
		int p = sc.nextInt();
		int pv = 1;
//		while(p>0) {
//			pv*=b;
//			p--;
//		}
		
		int i=1;
		while(i<=p) {
			pv*=b;
			i++;
		}
		System.out.println("Power Value: "+pv);
	}
}
