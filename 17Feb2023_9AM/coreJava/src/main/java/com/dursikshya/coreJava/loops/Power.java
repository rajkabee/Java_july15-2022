package com.dursikshya.coreJava.loops;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		int b, p, res;
		System.out.println("Base: ");
		Scanner sc = new Scanner(System.in);
		b=sc.nextInt();
		System.out.println("Power: ");
		p=sc.nextInt();
		
		res=1;
		//res=b*b*b*b-----b;
		while(p!=0) {
			
			res*=b;
			p--;
		}
		System.out.println("Result: "+res);
		
	}
}
