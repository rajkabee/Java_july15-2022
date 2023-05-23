package com.examples.j2se.collections;

import java.util.Iterator;
import java.util.LinkedList;

	public class LinkedListExample {
	public static void main(String[] args) {
		
		System.out.println("LinkedList: ");
		LinkedList<Integer> nums = new LinkedList<>();
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
//			for(int i=0; i<nums.size(); i++) {
//				System.out.println(nums.get(i));
//			}
//			for(int x: nums) {
//				System.out.println(x);
//			}
//			nums.forEach((x)->{System.out.println(x);});
//			nums.forEach(System.out::println);
		Iterator<Integer> iterator = nums.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}
}

