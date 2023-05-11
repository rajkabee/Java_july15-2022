package c0m.dursikshya.j2se.loops;

import java.util.Scanner;

public class DecToBin {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int dec = new Scanner(System.in).nextInt();
//		int bin=0, pv10=1, rem;
//		while(dec>0) {
//			rem=dec%2;
//			bin = rem*pv10+bin;
//			pv10*=10;
//			dec/=2;
//		}
		int bin=0, rbin=1, rem;
		while(dec>0) {
			rem=dec%2;
			rbin = rbin*10+rem;
			dec/=2;
		}
		while(rbin>1) {
			rem=rbin%10;
			bin=bin*10+rem;
			rbin/=10;
		}
		System.out.println("Bin: "+bin);
	}
}
