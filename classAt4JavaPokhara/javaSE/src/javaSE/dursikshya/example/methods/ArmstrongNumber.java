package javaSE.dursikshya.example.methods;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		int armv = armstrong(num);
		if(num==armv) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");			
		}
	}
	public static int armstrong(int n) {
		int dig = digits(n);
		int av=0, rem;
		while(n>0) {
			rem=n%10;
			av+=power(rem, dig);
			n/=10;
		}
		return av;
	}
	private static int power(int b, int p) {
		int res=1;
		while(p>0) {
			res*=b;
			p--;
		}
		return res;
	}
	private static int digits(int n) {
		if(n==0) {
			return 0;
		}
		return 1+digits(n/10);
	}

}
