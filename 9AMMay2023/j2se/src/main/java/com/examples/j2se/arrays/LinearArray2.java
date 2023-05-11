package com.examples.j2se.arrays;

public class LinearArray2 {
	public static void main(String[] args) {
		int[] age = {4,6,9,12,7};
		int i, sum=0, mean;
		for(i=0; i<age.length; i++) {
			sum+=age[i];
		}
		mean = sum/age.length;
		System.out.println("Total: "+sum);
		System.out.println("Average: "+mean);
	}
}
