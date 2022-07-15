package basics.control.function.recursive;

import java.util.Scanner;

public class PowerRecursive {
	public static void main(String[] args) {
		System.out.println("Enter the base: ");
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		System.out.println("Enter the power: ");
		int pow = sc.nextInt();
		int res = power(base, pow);
		System.out.println("Result: "+res);
	}

	private static int power(int base, int pow) {
		if(pow==0) {
			return 1;
		}
		else {
			return base*power(base, pow-1);
		}
	}
}
