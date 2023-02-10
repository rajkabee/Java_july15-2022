package javaBasics.methods.recursion;

import java.util.Scanner;

public class RecursePower {
	public static void main(String[] args) {
		System.out.println("Enter the base: ");
		Scanner sc = new Scanner(System.in);;
		int b =  sc.nextInt();
		System.out.println("Enter the power: ");
		int p = sc.nextInt();
		int res = power(b,p);
		System.out.println(
				String.format("the %d to the power %d = %d", b,p,res)
				);
	}

	private static int power(int b, int p) {
		if(p==0) {
			return 1;
		}
		return b*power(b, p-1);
	}
}
