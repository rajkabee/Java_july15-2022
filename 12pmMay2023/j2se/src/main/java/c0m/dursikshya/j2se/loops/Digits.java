package c0m.dursikshya.j2se.loops;

import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int t=num;
		int count=0, rem, rev=0;
		while(num!=0) {
			rem = num%10;
			rev=rev*10+rem;
			num/=10;
			count++;
		}
		System.out.println("No. of digits in "+t+": "+count);
		System.out.println("Reverse: "+rev);
	}
}
