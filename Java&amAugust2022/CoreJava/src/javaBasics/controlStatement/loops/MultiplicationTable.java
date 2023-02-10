package javaBasics.controlStatement.loops;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		System.out.println("Multiplication Table");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int product;
		int i=1;
		while(i<11) {
			product = num*i;
			System.out.println(num+" x "+i+" = "+product);
			i++;
		}
	}
}
