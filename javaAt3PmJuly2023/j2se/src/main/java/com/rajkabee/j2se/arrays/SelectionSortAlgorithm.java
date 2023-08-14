package com.rajkabee.j2se.arrays;

public class SelectionSortAlgorithm {
	public static void main(String[] args) {
		int[] x = { 34, 56, 45, 23, 19 };
		int i, j, k, min;
		for (i = 0; i < 4; i++) {
			min = i;
			for (j = i + 1; j < 5; j++) {
				if (x[min] > x[j]) {
					min = j;
				}
			}
			if (i != min) {
				// swap
				x[min] += x[i];
				x[i] = x[min] - x[i];
				x[min] = x[min] - x[i];
			}
		}
		for (k = 0; k < 5; k++) {
			System.out.print(x[k]+"   ");
		}
		System.out.println();


	}
}
