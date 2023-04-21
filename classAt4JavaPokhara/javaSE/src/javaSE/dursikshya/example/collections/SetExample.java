package javaSE.dursikshya.example.collections;

import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		HashSet<String> names = new HashSet<>();
		names.add("Nikole");
		names.add("Josh");
		names.add("Neha");
		names.add("Josh");
		names.add("Neha");
		
		names.forEach(System.out::println);
		System.out.println("Treeset: ");
		TreeSet<String> treeNames = new TreeSet<>();
		treeNames.add("Nikole");
		treeNames.add("Josh");
		treeNames.add("Neha");
		treeNames.add("Zene");
		treeNames.add("Phil");
		treeNames.forEach(System.out::println);
		
	}
}
