package javaBasics.controlStatement.conditionalStatement;

import java.util.Scanner;

public class IfStatement {
	public static void main(String[] args) {
		int age;
		System.out.println("What's your age?");
		age = new Scanner(System.in).nextInt();
		
		if(age<18) 
			System.out.println("You are still a minor...");
		
		else if(age<60) {
			System.out.println("You are an adult...");
		}
		else {
			System.out.println("You are a senior citizen...");
		}
		
	}
}
