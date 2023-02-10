package javaBasics.controlStatement.loops;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		System.out.println("Enter a binary number: ");
		int bin = new Scanner(System.in).nextInt();
		int rem;
		int dec = 0; 
		for(int pow2=1; bin!=0 ; pow2*=2,bin/=10) {
			dec+=pow2*(bin%10);
		}
		System.out.println("DEcimal Value: "+dec);
	}
}
