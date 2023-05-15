package com.examples.j2se.functions;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(armstrong(num)) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not a armstrong number!");
		}
	}
	
	static boolean armstrong(int n) {
		int dig = digits(n);
		int t=n, rem, av=0;
		while(t!=0) {
			rem=t%10;
			av+=power(rem, dig);
			t/=10;
		}
		return n==av;
	}
	
	static int power(int x, int p) {
		int res=1;
		while(p!=0) {
			res*=x;
			p--;
		}
		return res;
	}
	
	static int digits(int num) {
		int d=0;
		while(num!=0) {
			num/=10;
			d++;
		}
		return d;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		System.out.println("Enter a number: ");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int t, d, av, rem;
//		t=num;
//		d=0;
//		while(t!=0) {
//			t/=10;
//			d++;
//		}
//		av=0;
//		t=num;
//		while(t!=0) {
//			rem=t%10;
//			int i=0, pv=1;
//			while(i<d) {
//				pv*=rem;
//				i++;
//			}
//			av+=pv;
//			t/=10;
//		}
//		if(av==num)
//		System.out.println("Armstrong number");
//		else
//		System.out.println("not a armstrong number!");
//	}
	
}
