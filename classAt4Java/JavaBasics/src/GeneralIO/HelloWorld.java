package GeneralIO;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?\n:- ");
		String name = sc.nextLine();
		System.out.println(String.format("Hello %s!", name));
		System.out.println("How old are you?");
		int age = sc.nextInt();
		
		
	}
}
