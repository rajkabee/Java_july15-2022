package com.examples.j2se.control.loops;

import java.util.Scanner;

public class BinToDec {
	public static void main(String[] args) {
		int bin, dec, rem, pv;
		System.out.println("Enter a binary value: ");
		Scanner sc = new Scanner(System.in);
		bin = sc.nextInt();
		pv=1;
		dec=0;
		while(bin>0) {
			rem=bin%10;
			dec+=rem*pv;
			bin/=10;
			pv*=2;
		}
		System.out.println("Decimal Value: "+dec);
	}
}
