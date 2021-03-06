package basics.control.function;

import java.util.Scanner;

public class PowerFunc {
	public static void main(String[] args) {
		System.out.println("Enter the base: ");
		Scanner sc = new Scanner(System.in);
		int base  = sc.nextInt();
		System.out.println("Enter the power: ");
		int pow = sc.nextInt();
		int res = power(base, pow);
		System.out.println("Result: "+res);
	}

	private static int power(int base, int pow) {
		int res = 1;
		while(pow!=0) {
			res*=base;
			pow--;
		}
		return res;
	}
}
