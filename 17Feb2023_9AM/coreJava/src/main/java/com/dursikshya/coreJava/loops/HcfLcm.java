package com.dursikshya.coreJava.loops;

import java.util.Scanner;

public class HcfLcm {
	public static void main(String[] args) {
		System.out.println("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int hcf=1;
		/*
		int i = 2;
		while(i<=a && i<=b) {
			if(a%i==0 && b%i==0) {
				hcf=i;
			}
			i++;
		}
		*/
		
		int x=a;
		int y=b;
		int rem;
		do{
			rem=x%y;
			x=y;
			y=rem;
		}while(rem!=0);
		hcf=x;
		System.out.println("HCF: "+hcf);
		/*
		int lcm=a;
		while(!(lcm%a==0 && lcm%b==0)) {
			lcm++;
		}
		*/
		int lcm=(a*b)/hcf;
		
		System.out.println("LCM: "+lcm);
	}
}
