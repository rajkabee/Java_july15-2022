package j2se.dursikshya.arrays;

import java.util.Scanner;

public class CustomMatrixMultiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order of the first Matrix: ");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		System.out.println("Enter the order of the second Matrix: ");
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		
		if(c1!=r2) {
			System.out.println("These matrices cannot be multiplied: ");
		}
		else {
			int x[][] = new int[r1][c1];
			int y[][] = new int[r2][c2];
			int p[][] = new int[r1][c2];
			int i,j,k;
			System.out.println("Enter the elements in first matrix: ");
			for(i=0; i<r1; i++) {
				for(j=0; j<c1; j++) {
					x[i][j]=sc.nextInt();
				}
				System.out.println();
			}
			
			System.out.println("Enter the elements in second matrix: ");
			for(i=0; i<r2; i++) {
				for(j=0; j<c2; j++) {
					y[i][j]=sc.nextInt();
				}
				System.out.println();
			}
			for(i=0; i<r1; i++) {
				for(j=0; j<c2; j++) {
					p[i][j]=0;
					for(k=0; k<c1; k++) {
						p[i][j]+=x[i][k]*y[k][j];
					}
				}
			}
			
			
			//output
			
			for(i=0; i<r1; i++) {
				for(j=0; j<c1; j++) {
					System.out.print(x[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println("\tX");
			for(i=0; i<r2; i++) {
				for(j=0; j<c2; j++) {
					System.out.print(y[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println("\t=");
			for(i=0; i<r1; i++) {
				for(j=0; j<c2; j++) {
					System.out.print(p[i][j]+"\t");
				}
				System.out.println();
			}
			
		}
		
	}
}
