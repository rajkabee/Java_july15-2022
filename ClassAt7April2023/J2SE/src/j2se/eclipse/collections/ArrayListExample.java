package j2se.eclipse.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {
	public static void main(String[] args) {

		ArrayList<Integer> myList = new ArrayList<Integer>();
		int i;
		for(i=0; i<5; i++) {
			myList.add(i*3+4);
		}
		
		ListIterator<Integer> iterator = myList.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
		
//		Iterator<Integer> iterator = myList.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
//		myList.forEach(System.out::println);
		
//		myList.forEach((x)->{
//			System.out.println(x);
//		});
		
		
//		for(i=0; i<myList.size(); i++) {
//			System.out.println(myList.get(i));
//		}
//		for(int x:myList) {
//			System.out.println(x);
//		}
	
		
//		ArrayList list = new ArrayList();
//		list.add(123);
//		list.add("name");
//		list.add(true);
//		for(i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
	}
}
