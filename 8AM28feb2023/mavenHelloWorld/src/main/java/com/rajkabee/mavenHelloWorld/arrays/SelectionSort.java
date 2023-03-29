package com.rajkabee.mavenHelloWorld.arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1};
		int i,j,k;
		for(i=0; i<arr.length-1; i++) {
			for(j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					arr[i]+=arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]-=arr[j];
				}
			}
		}
		for(k=0; k<arr.length; k++) {
			System.out.print(arr[k]+", ");
		}
	}
}
