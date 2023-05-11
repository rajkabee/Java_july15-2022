package j2se.dursikshya.conditionals;

import java.util.Scanner;

public class IfStatement {
	public static void main(String[] args) {
		System.out.println("Enter your age: ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age<18) {
			System.out.println("You are a minor!");
			System.out.println("Let me get you a chocolate!");
		}
		else if(age<60) {
			System.out.println("You are an adult!");
		}
		else {
			System.out.println("You are a senior citizen!");
		}
		System.out.println("End");
	}
}
