package basics.control.function;

import java.util.Scanner;

public class FunctionIntro {
	public static void main(String[] args) {
		//System.out.println("What is your name?");
		//String name = new Scanner(System.in).next();
		String greetings = greet();
		System.out.println(greetings);
		//greet(name);
		//greet();
		
	}
	
	public static String greet() {
		System.out.println("What is your name?");
		String name = new Scanner(System.in).next();
		return "Hello "+name+"! How are you?";
		//System.out.println("Hello "+name+"! How are you?");
	}
	
}
