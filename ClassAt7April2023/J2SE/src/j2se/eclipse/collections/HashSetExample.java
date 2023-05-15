package j2se.eclipse.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<Integer> mySet = new HashSet<>();
		mySet.add(1);
		mySet.add(2);
		mySet.add(3);
		mySet.add(2);
		mySet.add(1);
		Iterator<Integer> it = mySet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
