package com.rajkabee.j2se.loops;

import java.util.Scanner;

public class HcfLcm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		int hcf=1, i;
//		i=1;
//		while(i<=a && i<=b) {
//			if(a%i==0 && b%i==0) {
//				hcf=i;
//			}
//			i++;
//		}
		int x=a, y=b;
		while(!(x%y==0)) {
			x=x%y;
			x=x+y;
			y=x-y;
			x=x-y;
		}
		hcf=y;
		System.out.println("HCF: "+hcf);
		int lcm = a*b/hcf;
		System.out.println("LCM: "+lcm);
		
	}
}
//swapping
//a=a+b;
//b=a-b;
//a=a-b;

//int c=a;
//a=b;
//b=c;
