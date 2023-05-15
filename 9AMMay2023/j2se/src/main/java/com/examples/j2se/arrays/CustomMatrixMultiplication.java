package com.examples.j2se.arrays;

import java.util.Scanner;

public class CustomMatrixMultiplication {
	public static void main(String[] args) {
		int a,b,c,d,i,j,k;
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
			int[][]p = new int[a][d];
			
			//input values in matrix
			System.out.println("Enter the elements of first Matrix: ");
			for(i=0; i<a; i++) {
				for(j=0; j<b; j++) {
					x[i][j]=sc.nextInt();
				}
				System.out.println();
			}
			System.out.println("Enter the elements of second Matrix: ");
			for(i=0; i<c; i++) {
				for(j=0; j<d; j++) {
					y[i][j]=sc.nextInt();
				}
				System.out.println();
			}
			
			for(i=0; i<a; i++) {
				for(j=0; j<d; j++) {
					p[i][j]=0;
					for(k=0; k<b; k++) {
						p[i][j]+=x[i][k]*y[k][j];
					}
					System.out.print(p[i][j]+"\t");
				}
				System.out.println();
			}
			
		}
	}
}
