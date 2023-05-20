package c0m.dursikshya.j2se.functions;

import java.util.Scanner;

public class Armstorng {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
//		int d=0, t, rem, av, pv, i;
//		t=n;
//		while(t!=0) {
//			d++;
//			t/=10;
//		}
//		av=0;
//		t=n;
//		while(t!=0) {
//			rem=t%10;
//			pv=1;
//			for(i=0; i<d; i++) {
//				pv*=rem;
//			}
//			av+=pv;
//			t/=10;
//		}
		int av=armstrong(n);
		if(n==av) {
			System.out.println("Armstrong number!");
		}
		else {
			System.out.println("not a armstrong number!");
		}
	}

	private static int armstrong(int n) {
		int d = digits(n);
		int av =0;
		while(n!=0) {
			av+=power(n%10, d);
			n/=10;
		}
		return av;
	}

	private static int power(int b, int p) {
		int res=1;
		while(p!=0) {
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
//		int d=0;
//		while(n!=0) {
//			d++;
//			n/=10;
//		}
//		return d;
//	}
}
