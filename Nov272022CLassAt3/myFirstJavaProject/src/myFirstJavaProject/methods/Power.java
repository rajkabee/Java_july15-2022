package myFirstJavaProject.methods;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		int b,p,res=1;
		System.out.println("Enter the base: ");
		Scanner sc = new Scanner(System.in);
		b = sc.nextInt();
		System.out.println("Enter the power: ");
		p = sc.nextInt();
		res=powerOf(b,p);
		System.out.println("result: "+res);
	}

	private static int powerOf(int b, int p) {
		if(p==0) {
			return 1;
		}
		else
			return b*powerOf(b,p-1);	
	}
}
