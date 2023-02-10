package myFirstJavaProject.loops;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		//Scanner sc = new Scanner(System.in);
		int num = new Scanner(System.in).nextInt();
		int i, product = 1;
		for(i=1; i<=num; i++) {
			product*=i;
		}
		System.out.println("factorial of "+num+": "+product);
	}
}
