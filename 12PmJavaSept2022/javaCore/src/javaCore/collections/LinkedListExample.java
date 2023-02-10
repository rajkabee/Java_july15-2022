package javaCore.collections;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<Integer> num = new LinkedList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		for(int i:num) {
			System.out.println(i);
		}
		
		
		
	}
}
