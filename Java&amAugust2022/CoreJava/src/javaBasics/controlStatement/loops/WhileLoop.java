package javaBasics.controlStatement.loops;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		int n;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		i=1;
		int sum=0;
		while(i<=n) {
			sum+=i;
			i++;
		}
		System.out.println("sum of "+n+" natural numbers : "+sum);
		
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		i=1;
		int product=1;
		while(i<=n) {
			product*=i;
			i++;
		}
		System.out.println("factorial of "+n+": "+product);
		
		
		
		i=0;
		while(i<5) {
			System.out.println(i+"While Loop Running!");
			i=i+1;
		}
	}
}
