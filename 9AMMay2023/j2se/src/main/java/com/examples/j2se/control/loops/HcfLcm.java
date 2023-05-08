package com.examples.j2se.control.loops;

import java.util.Scanner;

public class HcfLcm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int hcf, lcm, x,y,t;
		x=a;
		y=b;
		hcf=a;
//		while(!(a%hcf==0&&b%hcf==0)) {
//			hcf--;
//		}
		while(a%b!=0) {
			a%=b;
			t=a;
			a=b;
			b=t;
		}
		System.out.println("HCF: "+b);
//		lcm=x;
//		while(!(lcm%x==0&&lcm%y==0)) {
//			lcm++;
//		}
//		
		lcm =x*y/hcf;
		System.out.println("lcm: "+lcm);
		
		
		sc.close();
	}
	

}
