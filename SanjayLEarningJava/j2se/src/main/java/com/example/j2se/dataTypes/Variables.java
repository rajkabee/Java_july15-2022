package com.example.j2se.dataTypes;

import java.util.Scanner;

public class Variables {
	public static void main(String[] args) {
		int arr[]=new int[6];
		int x[]= {1,2,3,4,5};
		for(int i:x) {
			System.out.println(i);
		}
		for(int i=0; i<x.length; i++) {
			System.out.println(x[i]);
		}
		
	}
}
