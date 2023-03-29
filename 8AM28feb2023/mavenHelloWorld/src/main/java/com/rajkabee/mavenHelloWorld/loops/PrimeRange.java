package com.rajkabee.mavenHelloWorld.loops;

import java.util.Scanner;

public class PrimeRange {
	public static void main(String[] args) {
		System.out.println("Enter the range of prime numbers: ");
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		int i, flag, num;
		for (num = 2; num <= range; num++) {
			flag = 0;
			for (i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(num + "\t");
			}
		}
	}
}
