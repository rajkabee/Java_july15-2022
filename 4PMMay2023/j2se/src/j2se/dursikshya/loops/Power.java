package j2se.dursikshya.loops;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int p = sc.nextInt();
		int res=1, i=0;
		while(i<p) {
			res*=x;
			i++;
		}
		System.out.println(x+" to the power "+p+" = "+res);
		//System.out.println("result: "+res);
	}
}
