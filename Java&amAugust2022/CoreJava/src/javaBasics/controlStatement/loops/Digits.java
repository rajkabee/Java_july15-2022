package javaBasics.controlStatement.loops;

import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int dig = 0;
		while(num!=0) {
			num/=10;
			dig++;
		}
		System.out.println("the number of digits: "+dig);
	}
}
