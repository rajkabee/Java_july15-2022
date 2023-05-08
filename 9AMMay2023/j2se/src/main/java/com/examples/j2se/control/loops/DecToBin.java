package com.examples.j2se.control.loops;

import java.util.Scanner;

public class DecToBin {
	public static void main(String[] args) {
		int dec, bin, rbin, rem;
		System.out.println("Enter a decimal value: ");
		Scanner sc = new Scanner(System.in);
		dec = sc.nextInt();
		rbin=1;
		while(dec>0) {
			rem=dec%2;
			rbin=rbin*10+rem;
			dec/=2;
		}
		//System.out.println(rbin);
		bin=0;
		while(rbin>0) {
			rem=rbin%10;
			bin=bin*10+rem;
			rbin/=10;
		}
		bin/=10;
		System.out.println(bin);
		
	}
}
