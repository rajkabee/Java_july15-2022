package c0m.dursikshya.j2se.loops;

import java.util.Scanner;

public class HcfLcm {
	public static void main(String[] args) {
		System.out.println("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x=a,y=b, lcm;
		while(a%b!=0) {
			a=a%b;
			//swap
			a+=b;
			b=a-b;
			a-=b;
		}
		System.out.println("HCF: "+b);
		lcm = x*y/b;
		System.out.println("LCM: "+lcm);
		
	}
}
