package javaCore.dataTypes;

import java.util.Scanner;

public class Variables {
	public static void main(String[] args) {
		byte b = 45;
		b = 127;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		b = sc.nextByte();
		System.out.println("the number you entered : "+b);
		System.out.println(String.format("the number you entered : %d", b));
	}
}
