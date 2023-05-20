package com.examples.j2se.collections;

import java.util.ArrayList;

public class ArrayListExamples {
	public static void main(String[] args) {
		int arr[]=new int[3];
		arr[0]=10;
		arr[1]=12;
		arr[2]=15;
		//arr[3]=34;
		
		System.out.println("Array: ");
		for(int x:arr) {
			System.out.println(x);
		}
		System.out.println("ArrayList: ");
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(23);
		nums.add(13);
		nums.add(56);
		nums.add(54);
		nums.add(39);
		nums.add(81);
		nums.add(23);
		nums.add(13);
		nums.add(56);
		nums.add(54);
		nums.add(39);
		nums.add(81);
		nums.add(23);
		nums.add(13);
		nums.add(56);
		nums.add(54);
		nums.add(39);
		nums.add(81);
//		for(int i=0; i<nums.size(); i++) {
//			System.out.println(nums.get(i));
//		}
//		for(int x: nums) {
//			System.out.println(x);
//		}
//		nums.forEach((x)->{System.out.println(x);});
		nums.forEach(System.out::println);
		
		
	}
}
