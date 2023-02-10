package javaBasics.methods;

import java.util.Scanner;

public class NumDigits {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int dig = digits(num);
		System.out.println("no. of digits in "+num+" is "+dig);
		int rev = reverse(num);
		System.out.println("Reversed number: "+rev);
	}

	private static int reverse(int num) {
		int rev=0, rem;
		while(num!=0) {
			rem = num%10;
			rev=rev*10+rem;
			num/=10;
		}
		return rev;
	}

	private static int digits(int num) {
		int i=0;
		while(num!=0) {
			num/=10;
			i++;
		}
		return i;
	}
}
