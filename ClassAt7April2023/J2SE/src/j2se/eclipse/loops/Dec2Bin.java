package j2se.eclipse.loops;

import java.util.Scanner;

public class Dec2Bin {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Decimal Value: ");
		int dec = sc.nextInt();	//29
		int rbin=1, rem, bin=0;
		while(dec>0) {
			rem=dec%2;
			rbin = rbin*10+rem;
			dec/=2;
		}
		//System.out.println("Rbin: "+rbin);
		
		while(rbin>1) {
			rem=rbin%10;
			bin=bin*10+rem;
			rbin/=10;
		}
		System.out.println("Binary Value: "+bin);
	}
}
