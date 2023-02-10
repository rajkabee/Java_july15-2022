package javaBasics.collectionVariables.arrays;

import java.util.Scanner;

public class ArraysInJava {
	public static void main(String[] args) {
		float marks[] = new float[5];
		String[] subjects={"Physics", "Chemistry", "Mathematics", "Computer", "Biology"};
		int i;
		Scanner sc = new Scanner(System.in);
		
		for(i=0; i<5; i++) {
			System.out.println("Marks obtained in "+subjects[i]+":");
			marks[i] = sc.nextFloat();
		}
		for(i=0; i<5; i++) {
			System.out.println("Marks obtained in "+subjects[i]+" : "+marks[i]);
		}
	}
}
