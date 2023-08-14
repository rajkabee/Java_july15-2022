package com.rajkabee.j2se.loops;

import java.util.Scanner;

public class Dec2Bin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Decimal number: ");
		int dec = sc.nextInt();	
		int bin=0, rem, pv=1;
		while(dec>0) {
			rem = dec%2;
			bin+=rem*pv;
			pv*=10;
			dec/=2;
		}
		System.out.println("Binary Value: "+bin);
		
	}
}
