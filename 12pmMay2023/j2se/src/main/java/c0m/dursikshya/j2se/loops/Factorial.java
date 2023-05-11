package c0m.dursikshya.j2se.loops;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fact=1;
		for(int i=1; i<=num; i++) {
			fact*=i;
		}
		System.out.println("Factorial of "+num+": "+fact);
	}
}
