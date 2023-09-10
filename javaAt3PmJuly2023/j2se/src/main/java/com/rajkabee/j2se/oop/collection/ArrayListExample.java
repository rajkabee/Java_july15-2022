package com.rajkabee.j2se.oop.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListExample {
	public static void main(String[] args) {
		LinkedList<Integer> x = new LinkedList<>();
		x.add(34);
		x.add(52);
		x.add(12);
		x.add(76);
		x.add(17);
//		int i;
//		for(i=0; i<x.size(); i++) {
//			System.out.println(x.get(i));
//		}
		
//		for(int y:x) {
//			System.out.println(y);
//		}
		
//		x.forEach(a->{
//			System.out.println(a);
//		});
		
		x.forEach(System.out::println);
	}
}
