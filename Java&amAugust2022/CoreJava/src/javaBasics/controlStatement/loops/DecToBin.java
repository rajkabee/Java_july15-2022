package javaBasics.controlStatement.loops;

import java.util.Scanner;

public class DecToBin {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int dec = new Scanner(System.in).nextInt();
		int rem;
		int rbin;
		for(rbin = 1; dec!=0; dec/=2) {
			rem=dec%2;
			rbin=rbin*10+rem;
		}
		int bin;
		for(bin=0; rbin!=1; rbin/=10) {
			rem = rbin%10;
			bin = bin*10+rem;
		}
		System.out.println("Binary: "+bin);
	}
}
