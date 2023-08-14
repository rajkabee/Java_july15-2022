package com.rajkabee.j2se.loops;
import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = sc.nextInt();
		
		int i=1;
		while(i<11) {
			System.out.println(x+" x "+i+" = "+x*i);
			i++;
		}
	}
}
