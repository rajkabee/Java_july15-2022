package com.dursikshya.coreJava.loops;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i=1;
		while(i<=10) {
			System.out.println(num+" x "+i+" = "+i*num);
			i++;
		}
	}
}
