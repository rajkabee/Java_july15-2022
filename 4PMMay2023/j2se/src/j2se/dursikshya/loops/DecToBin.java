package j2se.dursikshya.loops;

import java.util.Scanner;

public class DecToBin {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int dec = sc.nextInt();
		int bin=0, rem, rbin=1, pv=1;
		
		while(dec>0) {
			rem=dec%2;
			bin = bin+rem*pv;
			pv*=10;
			dec/=2;
		}
		
		
		
//		while(dec>0) {
//			rem=dec%2;
//			rbin=rbin*10+rem;
//			dec/=2;
//		}
//		
//		while(rbin>1) {
//			rem=rbin%10;
//			bin=bin*10+rem;
//			rbin/=10;
//		}
		System.out.println(bin);
		
	}
}
