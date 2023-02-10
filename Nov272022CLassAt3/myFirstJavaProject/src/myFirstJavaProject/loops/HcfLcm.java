package myFirstJavaProject.loops;

import java.util.Scanner;

public class HcfLcm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c=a;
		int d=b;
		int t;
		while(a%b!=0) {
			a=a%b;
			t=a;
			a=b;
			b=t;
		}
		System.out.println("Hcf: "+b);
		/*
		int lcm=c;
		while(!(lcm%c==0 && lcm%d==0)) {
			lcm++;
		}
		*/
		int lcm = (c*d)/b;
		System.out.println("LCM: "+lcm);
		
		sc.close();
	}
}
