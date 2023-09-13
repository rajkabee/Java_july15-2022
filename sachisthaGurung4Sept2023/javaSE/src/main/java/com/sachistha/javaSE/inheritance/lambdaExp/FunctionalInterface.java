package com.sachistha.javaSE.inheritance.lambdaExp;

import java.util.Arrays;
import java.util.List;

public class FunctionalInterface {
	interface Square{
		int calculate(int x);
	}
	
	public static void main(String[] args) {
		Square area = (int x)->x*x;
		
		Square perimeter = new Square() {
			@Override
			public int calculate(int x) {
				return 4*x;
			}
			
		};
		
		List<Integer> myList = Arrays.asList(new Integer[]{1,2,3,4,5});
//		for(int i=0; i<myList.size(); i++) {
//			System.out.println(myList.get(i));
//		}
		
		for(int x:myList) {
			System.out.println(x);
		}
		
		myList.forEach((a)->{
			System.out.println(a);	
		});
		
		myList.forEach(System.out::println);
	}
}
