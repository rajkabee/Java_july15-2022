package javaBasics.methods;

import java.util.Scanner;

public class Bin2Dec {
	public static void main(String[] args) {
		System.out.println("Enter a binary value: ");
		long bin = new Scanner(System.in).nextLong();
		int rem, dec=0;
		int m=1;
		while(bin!=0) {
			rem=(int)bin%10;
			dec+=rem*m;
			m*=2;
			bin/=10;
		}
		System.out.println("Decimal value: "+dec);
	}
}
