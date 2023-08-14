package com.rajkabee.j2se.arrays;

import java.util.Scanner;

public class CustomMatrixMultiplication {
	public static void main(String[] args) {
		int r1,r2,c1,c2,i,j,k;
		System.out.println("Enter the order of the first Matrix: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Row: ");
		r1=sc.nextInt();
		System.out.println("Column: ");
		c1=sc.nextInt();
		System.out.println("Enter the order of the second Matrix: ");
		System.out.println("Row: ");
		r2=sc.nextInt();
		System.out.println("Column: ");
		c2=sc.nextInt();
		if(!(c1==r2)) {
			System.out.println("the matrices cannot be multiplied!");
		}
		else {
			int[][] a = new int[r1][c1];
			int[][] b = new int[r2][c2];
			int[][] p = new int[r1][c2];
			System.out.println("Enter the values of the first matrix: ");
			for(i=0; i<r1; i++) {
				for(j=0; j<c1; j++) {
					System.out.println("a["+i+"]["+j+"]: ");
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter the values of the second matrix: ");
			for(i=0; i<r2; i++) {
				for(j=0; j<c2; j++) {
					System.out.println("b["+i+"]["+j+"]: ");
					b[i][j]=sc.nextInt();
				}
			}
			
			System.out.println("Product Matrix: ");
			for(i=0; i<r1; i++) {
				for(j=0; j<c2; j++) {
					p[i][j]=0;
					for(k=0; k<c1; k++) {
						p[i][j]+=a[i][k]*b[k][j];
					}
					System.out.print(p[i][j]+"\t");
				}
				System.out.println();
			}
		}
		
		
	}
}
