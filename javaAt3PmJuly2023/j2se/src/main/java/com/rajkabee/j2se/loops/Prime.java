package com.rajkabee.j2se.loops;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		if(num<2) {
			System.out.println("The number id neither prime nor composite!");
		}
		else {
			int i=2;
			while(i<=num/2) {
				if(num%i==0) {
					break;
				}
				i++;
			}
			
			if(i==(num/2)+1) {
				System.out.println("Prime");
			}
			else {
				System.out.println("Composite");
			}
		}
	}
}
