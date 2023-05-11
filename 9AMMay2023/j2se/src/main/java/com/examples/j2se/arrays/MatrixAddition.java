package com.examples.j2se.arrays;

public class MatrixAddition {
	public static void main(String[] args) {
		int[][] a = {{1,2,3}, {4,5,6}};
		int[][] b = {{9,8,7}, {6,5,4}};
		int[][] c = new int[2][3];
		int i,j;
		for(i=0; i<a.length; i++) {
			for(j=0; j<a[0].length; j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(i=0; i<a.length; i++) {
			for(j=0; j<a[0].length; j++) {
				System.out.print(c[i][j]+"  ");
			}
			System.out.println();
		}
		
	}
	
}
