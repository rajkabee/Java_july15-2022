package javaBasics.methods;

import java.util.Scanner;

public class Decimal2Binary {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int dec = sc.nextInt();
		int bin = binary(dec);
		System.out.println("binary value of "+dec+" is "+bin);
	}

	private static int binary(int dec) {
		int rem, rbin=1;
		while(dec!=0) {
			rem=dec%2;
			rbin=rbin*10+rem;
			dec/=2;
		}
		int bin = reverse(rbin);
		return bin/10;
	}

	private static int reverse(int rbin) {
		int bin=0, rem;
		while(rbin!=0) {
			rem = rbin%10;
			bin = bin*10+rem;
			rbin/=10;
		}
		return bin;
	}
	
}
