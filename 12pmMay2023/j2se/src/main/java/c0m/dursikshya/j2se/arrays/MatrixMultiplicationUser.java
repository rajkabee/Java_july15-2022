package c0m.dursikshya.j2se.arrays;

import java.util.Scanner;

public class MatrixMultiplicationUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order of first matrix: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter the order of Second matrix: ");
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		if(b!=c) {
			System.out.println("The matrices cannot be multilplied: ");
		}
		else {
			int[][] x = new int[a][b];
			int[][] y = new int[c][d];
			int[][] p = new int[a][d];
			int i,j,k;
			
			System.out.println("Enter the elements of the first matrix: ");
			for(i=0; i<x.length; i++) {
				for(j=0; j<x[0].length; j++) {
					x[i][j]=sc.nextInt();
				}
				System.out.println();
			}
			System.out.println("Enter the elements of the second matrix: ");
			for(i=0; i<y.length; i++) {
				for(j=0; j<y[0].length; j++) {
					y[i][j]=sc.nextInt();
				}
				System.out.println();
			}
			
			for(i=0; i<p.length; i++) {
				for(j=0; j<p[0].length; j++) {
					p[i][j]=0;
					for(k=0; k<y.length; k++) {
						p[i][j]+=x[i][k]*y[k][j];
					}
					System.out.print(p[i][j]+"\t");
				}
				System.out.println();
			}
			
			
		}
	}
}
