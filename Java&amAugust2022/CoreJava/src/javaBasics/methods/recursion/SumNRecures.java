package javaBasics.methods.recursion;

import java.util.Scanner;

public class SumNRecures {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int n = new Scanner(System.in).nextInt();
		int sum = sumN(n);
		System.out.println("sum of "+n+" natural numbers: "+sum);
	}

	private static int sumN(int n) {
		if(n==1) {
			return 1;
		}
		return n+sumN(n-1);
	}
	
	
	
}
