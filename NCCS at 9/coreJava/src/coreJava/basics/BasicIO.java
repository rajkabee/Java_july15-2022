package coreJava.basics;

import java.util.Scanner;

public class BasicIO {
	public static void main(String[] args) {
		System.out.println("Enter your age: ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		System.out.println("your age: "+age);
		System.out.println(String.format("Your age: %dyears.", age));
		System.out.println("What is your name?");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Hello, "+name+"!");
	}
}
