package javaBasics.methods;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String res = prime(num);
		System.out.println(num+" is a "+res+" number.");
	}

	static String prime(int num) {
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				return "composite";
			}
		}	
		return "prime";
	}
}
