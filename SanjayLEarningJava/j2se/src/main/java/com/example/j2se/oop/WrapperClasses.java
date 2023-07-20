package com.example.j2se.oop;

import java.util.ArrayList;
import java.util.Iterator;

public class WrapperClasses {
	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<>();
		myList.add(23);
		myList.add(24);
		myList.add(45);
		myList.add(62);
		myList.add(99);
		int x=myList.get(0);
//		for(int i=0; i<myList.size(); i++) {
//			System.out.println(myList.get(i));
//		}
//		
//		for(int j:myList) {
//			System.out.println(j);
//		}
//		Iterator<Integer> iter = myList.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
		myList.forEach(System.out::println);
		
		
		
	}
}
