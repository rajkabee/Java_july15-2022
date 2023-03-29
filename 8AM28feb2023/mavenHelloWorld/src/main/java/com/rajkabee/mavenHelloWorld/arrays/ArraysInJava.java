package com.rajkabee.mavenHelloWorld.arrays;

public class ArraysInJava {
	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4, 5 };
		int arr[] = new int[25];
		int[] age = new int[4];
		age[0]=23;
		age[1]=43;
		age[2]=19;
		age[3]=52;
		int i ;
		for (i= 0; i < 5; i++) {
			System.out.println(num[i]);
		}
		for(i=0; i<age.length; i++) {
			System.out.println("age: "+age[i]);
		}
	}
}
