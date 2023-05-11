package j2se.eclipse.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<Integer> myList = new LinkedList<Integer>();
		int i;
		for(i=0; i<50; i++) {
			myList.add(i*3+4);
		}
		for(i=0; i<myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		
	}
}
