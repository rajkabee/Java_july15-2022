package com.dursikshya.coreJava.conditionals;

import java.util.Scanner;

public class IfStatement {
	public static void main(String[] args) {
		int age;
		System.out.println("Enter your age: " );
		Scanner sc = new Scanner(System.in);
		age=sc.nextInt();
		if(age<18) {
			System.out.println("You are a Minor.");
			System.out.println("Let me get you a chocolate!");
		}
		else if(age<60) {
			System.out.println("You are an adult.");
		}
		else {
			System.out.println("You are a Senior Citizen!");
		}
		
		
	}
}
