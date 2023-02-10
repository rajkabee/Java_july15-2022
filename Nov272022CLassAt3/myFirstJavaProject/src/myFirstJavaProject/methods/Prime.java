package myFirstJavaProject.methods;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num=sc.nextInt();
		boolean isPrime = prime(num);
		if(isPrime) {
			System.out.println("Prime");
		}
		else {
			System.out.println("composite");
		}
	}

	private static boolean prime(int num) {
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}
