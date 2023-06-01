package com.example.demo.strings;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		//int[] nums = new int[5];
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(12);
		nums.add(34);
		nums.add(21);
		nums.add(25);
		nums.add(67);
		nums.add(18);
//		
//		for(int i=0; i<nums.size(); i++) {
//			System.out.println(nums.get(i));
//		}
		nums.forEach(System.out::println);
		
//		for(int x:nums) {
//			System.out.println(x);
//		}
		
	}
}
