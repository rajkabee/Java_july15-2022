package com.dursikshya.coreJava.loops;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		int i;
		//i=10;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Do while Loop");
			System.out.println("Enter the value of i: ");
			i=sc.nextInt();
		}while(i<5);
		
	}
}	
