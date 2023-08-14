package com.rajkabee.j2se.arrays;

public class TwoDArray {
	public static void main(String[] args) {
		int[][] x= {{1,2,3,4}, {4,5,6,7}, {7,8,9,0}};
		int[][] y= {{4,3,2,6}, {3,5,4,9}, {2,3,9,1}};
		int[][] sum = new int[3][4];
		int i,j;
		for(i=0; i<3; i++) {
			for(j=0; j<4 ; j++) {
				sum[i][j]=x[i][j]+y[i][j];
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}
}