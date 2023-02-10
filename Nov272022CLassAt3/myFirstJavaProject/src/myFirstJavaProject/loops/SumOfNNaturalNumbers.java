package myFirstJavaProject.loops;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		//Scanner sc = new Scanner(System.in);
		int num = new Scanner(System.in).nextInt();
		int i, sum = 0;
		for(i=1; i<=num; i++) {
			sum+=i;
		}
		System.out.println("Sum of "+num+" natural numbers: "+sum);
	}

}
