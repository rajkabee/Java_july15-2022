package javaBasics.controlStatement.loops;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n1=0, n2=1, n3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range: ");
		int range = sc.nextInt();
		while(n1<=range) {
			System.out.println(n1);
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
	}
}
