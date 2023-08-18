package com.rajkabee.j2se.methods;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of the fibonacci series values: ");
		int num = sc.nextInt();
		int n1=0, n2=1, n3, i=0;
		while(i<num) {
			System.out.println(n1);
			n3=n1+n2;
			n1=n2;
			n2=n3;
			i++;
		}
		
//		System.out.println("Enter the range of the fibonacci series: ");
//		int num = sc.nextInt();
//		int n1=0, n2=1, n3;
//		while(n1<=num) {
//			System.out.println(n1);
//			n3=n1+n2;
//			n1=n2;
//			n2=n3;
//		}
		
		
		
	}
}
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...