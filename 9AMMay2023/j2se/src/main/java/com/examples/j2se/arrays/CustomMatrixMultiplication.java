package com.examples.j2se.arrays;

import java.util.Scanner;

public class CustomMatrixMultiplication {
	public static void main(String[] args) {
		int a,b,c,d;
		System.out.println("Enter the order of first matrix: ");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter the order of second matrix: ");
		c=sc.nextInt();
		d=sc.nextInt();
		
		if(b!=c) {
			System.out.println("Matrices cannot be multiplied!");
		}
		else {
			int[][]x = new int[a][b];
			int[][]y = new int[c][d];
			
			//input values in matrix
		}
	}
}
