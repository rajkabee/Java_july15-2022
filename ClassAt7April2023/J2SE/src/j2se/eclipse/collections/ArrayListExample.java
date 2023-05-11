package j2se.eclipse.collections;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {

		ArrayList<Integer> myList = new ArrayList<>();
		int i;
		for(i=0; i<50; i++) {
			myList.add(i*3+4);
		}
		for(i=0; i<myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		
		ArrayList list = new ArrayList();
		list.add(123);
		list.add("name");
		list.add(true);
		for(i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
