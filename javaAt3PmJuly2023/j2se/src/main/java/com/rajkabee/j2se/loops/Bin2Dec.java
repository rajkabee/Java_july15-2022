package com.rajkabee.j2se.loops;

import java.util.Scanner;

public class Bin2Dec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary number: ");
		int bin = sc.nextInt();		//1111
		int dec=0, rem, pv=1;
		
		while(bin >0) {
			rem = bin%10;
			dec+=rem*pv;
			pv*=2;
			bin/=10;
		}
		System.out.println("Decimal Value: "+dec);
		
	}
}
