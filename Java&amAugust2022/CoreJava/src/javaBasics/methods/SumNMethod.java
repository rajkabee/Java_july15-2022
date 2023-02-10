package javaBasics.methods;

import java.util.Scanner;

public class SumNMethod {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = sumn(n);
		System.out.println("sum of "+n+" natural numbers: "+sum);
	}

	private static int sumn(int n) {
		int i=0;
		int sum=0;
		while(i<=n) {
			sum=sum+i;
			i++;
		}
		return sum;
	}
}
