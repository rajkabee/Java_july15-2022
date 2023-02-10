package myFirstJavaProject.loops;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i, product = 0;
		for(i=1; i<=10; i++) {
			product=num*i;
			System.out.println(num+" x "+i+" = "+product);
		}
		
	}
}
