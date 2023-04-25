package j2se.eclipse.loops;

import java.util.Scanner;

public class Bin2Dec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Binary Value: ");
		int bin = sc.nextInt();		//110111=1*32+1*16+0*8+1*4+1*2+1*1=55
		int pv2 = 1;
		int rem, dec=0;
		while(bin>0) {
			rem = bin%10;
			dec=dec+rem*pv2;
			pv2=pv2*2;
			bin = bin/10;
		}
		System.out.println("Decimal Value: "+dec);
		
	}
}
