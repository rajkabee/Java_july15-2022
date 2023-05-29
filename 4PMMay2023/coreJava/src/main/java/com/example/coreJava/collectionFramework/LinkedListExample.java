package com.example.coreJava.collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<Integer> nums = new LinkedList<>();
		nums.add(12);
		nums.add(17);
		nums.add(34);
		nums.add(38);
		nums.add(22);
		nums.add(31);
		nums.add(12);
		nums.add(17);
		nums.add(34);
		nums.add(38);
		nums.add(22);
		nums.add(31);
		nums.forEach(System.out::println);
	}
}
