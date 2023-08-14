package com.rajkabee.j2se.arrays;

public class BubbleSortExample {
	public static void main(String[] args) {
		int[] x = { 5, 4, 3, 2, 1 };
		int i, j, k;
		for (j = 0; j< 4; j++) {
			for (i = 0; i < 4-j; i++) {
				if (x[i] > x[i + 1]) {
					x[i] += x[i + 1];
					x[i + 1] = x[i] - x[i + 1];
					x[i] -= x[i + 1];
				}
			}
		}
		for (k = 0; k < 5; k++) {
			System.out.print(x[k] + "\t");
		}
		System.out.println();
	}
}

//a=7;12;5;
//b=5;7;
//a+=b;
//b=a-b;
//a-=b;
