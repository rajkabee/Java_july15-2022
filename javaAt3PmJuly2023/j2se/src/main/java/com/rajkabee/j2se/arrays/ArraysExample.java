package com.rajkabee.j2se.arrays;

public class ArraysExample {
	public static void main(String[] args) {
		int[] x = {21,32,24,17,69,93,12,23,56,66};
		int sum=0;
		for(int i=0; i<x.length; i++) {
			sum=sum+x[i];
		}
		System.out.println("Sum: "+sum);
		int mean = sum/x.length;
		System.out.println("Average: "+mean);
		
		
		
//		int[] y = new int[5];
//		System.out.println(x[9]);
//		int i;
//		for(i=0; i<5; i++) {
//			y[i]=10*i-4+i;
//		}
//		for(i=0; i<5; i++) {
//			System.out.println(y[i]);
//		}
		
	}
}
