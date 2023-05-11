package com.examples.j2se.arrays;

public class LinearArray {
	public static void main(String[] args) {
		int[] x = new int[50];
		int y[] = new int[5];
		int[] z = {1,2,3,4,5,6,7,4,5,6,9};
		z[0]=9;
		int i;
		for(i=0; i<x.length; i++) {
			x[i]=(123/(i+5))+7;
		}
		for(i=0; i<z.length; i++) {
			System.out.println(z[i]);
		}
		System.out.println(z.length);
		
		
	}
}
