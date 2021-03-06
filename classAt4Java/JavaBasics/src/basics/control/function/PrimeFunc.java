package basics.control.function;

import java.util.Scanner;

public class PrimeFunc {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		boolean res = prime(num);
		if(res) {
			System.out.println("Prime");
		}else {
			System.out.println("Composite");
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
