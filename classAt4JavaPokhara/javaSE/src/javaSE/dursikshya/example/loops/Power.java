package javaSE.dursikshya.example.loops;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		int b, p, res=1, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("base: ");
		b = sc.nextInt();
		System.out.println("power: ");
		p = sc.nextInt();
		
//		for(i=0; i<p; i++) {
//			res*=b;
//		}
		
		while(p!=0) {
			res*=b;
			p--;
		}
		
		System.out.println("Result: "+res);
	}
}
