package javaBasics.intro;

import java.util.Scanner;

public class BasicIO {
	public static void main(String[] args) {
		System.out.println("What is your name? ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("Hello, "+name+", how old are you?");
		int age = scanner.nextInt();
		System.out.println("so you are "+age+"years old!");
		System.out.println(String.format("so you are %dyears old!", age));
		
		String strAge = age+"";
	}
}
