package basics.control.loops;

import java.util.Scanner;

public class SumOfNEvenNumbers {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n = sc.nextInt();
		int res = 0;
		for(int i=1; i<=n; i++) {
			res = res+(i*2);
		}
		System.out.println("Sum of "+n+" even numbers : "+res+".");
	}
}
