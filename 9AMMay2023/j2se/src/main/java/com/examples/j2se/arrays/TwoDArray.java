package com.examples.j2se.arrays;

public class TwoDArray {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4},{4,5,6,7},{7,8,9,10}};
		//int[][] arr2 = new int[3][4];
		int i,j;
		for(i=0; i<3; i++) {
			for(j=0; j<4; j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
