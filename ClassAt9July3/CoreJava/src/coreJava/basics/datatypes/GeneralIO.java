package coreJava.basics.datatypes;

import java.util.Scanner;

public class GeneralIO {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		//String name = sc.next();
		String name = sc.nextLine();
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		//float f = sc.nextFloat();
		
		System.out.println(name+"\t"+age);
		System.out.println(String.format("%s\t%d", name, age));
	}
}
