package basics.control.function.recursive;

import java.util.Scanner;

public class FibonacciValue {
	public static void main(String[] args) {
		System.out.println("Enter the position of the fibonacci value: ");
		int n = new Scanner(System.in).nextInt();
		int val = fib(n-1);
		System.out.println(n+"th fibonacci value : "+val);
	}

	private static int fib(int n) {
		if(n<2) {
			return n;
		}
		else {
			return fib(n-1)+fib(n-2);
		}
	}
}
