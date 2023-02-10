package javaBasics.methods;

import java.util.Scanner;

public class PowerMethod {
	public static void main(String[] args) {
		System.out.println("Enter the base: ");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		System.out.println("Enter the power: ");
		int p = sc.nextInt();
		int res = power(b,p);
		System.out.println(String.format("%d to the power %d is %d", b,p,res));
	}

	private static int power(int b, int p) {
		int r=1;
		while(p!=0) {
			r*=b;
			p--;
		}
		return r;
	}
}
