package com.rajkabee.mavenHelloWorld.arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1};
		int i,j,k;
		for(i=0; i<arr.length-1; i++) {
			for(j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					//swap
					arr[j]+=arr[j+1];
					arr[j+1]=arr[j]-arr[j+1];
					arr[j]-=arr[j+1];
				}
				for(k=0; k<arr.length; k++) {
					System.out.print(arr[k]+"  ");
				}
				System.out.println();
			}
			
		}
		for(k=0; k<arr.length; k++) {
			System.out.print(arr[k]+"  ");
		}
	}
}
