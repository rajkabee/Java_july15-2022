package com.examples.j2se.arrays;

public class BubbleSortAlgorithm {
	public static void main(String[] args) {
		int[] age = {8,7,6,5,4};
		int i,j, t;
		
		for(i=0; i<4; i++) {
			for(j=0; j<4-i; j++) {
				for(t=0; t<5; t++) {
					System.out.print(age[t]+"  ");
				}
				System.out.println();
				if(age[j]>age[j+1]) {
					//swap
					t=age[j];
					age[j]=age[j+1];
					age[j+1]=t;
				}
			}
			System.out.println();
		}
		for(t=0; t<5; t++) {
			System.out.print(age[t]+"  ");
		}
	}
}
