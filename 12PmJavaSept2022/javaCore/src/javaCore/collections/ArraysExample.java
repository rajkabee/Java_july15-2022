package javaCore.collections;

public class ArraysExample {
	public static void main(String[] args) {
		//int[] marks = {32,43,35,46,57};
		int[] marks = new int[5];
		marks[0]=123;
		marks[1]=3423;
		marks[2]=2321;
		for(int i=0; i<5; i++) {
			System.out.println(marks[i]);
		}
		
		String[] names = {"Sunita", "Alina", "Bandana", "Sanjeev", "Sudeep"};
		for(int i=0; i<5; i++) {
			System.out.println(names[i]);
		}
		
	}
}
