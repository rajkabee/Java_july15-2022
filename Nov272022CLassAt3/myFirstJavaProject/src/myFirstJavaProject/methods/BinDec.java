package myFirstJavaProject.methods;

import java.util.Scanner;

public class BinDec {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Make a choice:");
		System.out.println("1. Binary to decimal");
		System.out.println("2. Decimal to binary");
		int ch = sc.nextInt();
		if(ch==1) {
			binToDec();
		}
		else {
			decToBin();
		}
	}

	private static void decToBin() {
		System.out.println("Enter a Decimal Number: ");
		int dec = sc.nextInt();
		int bin=1;
		while(dec!=0) {
			bin=(bin*10)+(dec%2);
			dec/=2;
		}
		bin=reverse(bin)/10;
		System.out.println("Decimal Value: "+bin);
	}

	private static int reverse(int num) {
		int rev = 0;
		while(num!=0) {
			rev=rev*10+(num%10);
			num/=10;
		}
		return rev;
	}

	private static void binToDec() {
		System.out.println("Enter a Binary Number: ");
		int bin = sc.nextInt();
		int dec=0;
		int p2=1;
		while(bin!=0) {
			dec+=(bin%10)*p2;
			p2*=2;
			bin/=10;
		}
		System.out.println("Decimal Value: "+dec);
	}
}
