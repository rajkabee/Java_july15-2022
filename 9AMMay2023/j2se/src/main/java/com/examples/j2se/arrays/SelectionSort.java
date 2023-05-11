package com.examples.j2se.arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a = {6,4,7,2,5,1,8,9,3};
		int i, j, min,t;
		
		for(i=0; i<a.length-1; i++) {
			min=i;
			for(j=i+1; j<a.length; j++) {
				if(a[min]>a[j]) {
					min=j;
				}
			}
			t=a[min];
			a[min]=a[i];
			a[i]=t;
			
		}
		for(t=0; t<a.length; t++) {
			System.out.print(a[t]+"  ");
		}
		System.out.println();
	}
}
