package com.sachistha.javaSE.sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int a[] = {5,4,3,2,1};
		int i, j, k;
		for(i=0; i<4; i++) {
		for(j=0; j<4-i; j++) {
			if(a[j]>a[j+1]) {
				a[j]+=a[j+1];
				a[j+1]=a[j]-a[j+1];
				a[j]-=a[j+1];
			}
			for(k=0; k<5; k++) {
				System.out.print(a[k]+"\t");
			}
			System.out.println();
		}
		}
		
		String names[]={"Shushil", "binaya", "Ranjana"};
		for(i=0; i<3; i++) {
			if(names[i].endsWith("a")) {
				System.out.println(names[i]);
			}
		}
		
		
		
		
	}
}	
