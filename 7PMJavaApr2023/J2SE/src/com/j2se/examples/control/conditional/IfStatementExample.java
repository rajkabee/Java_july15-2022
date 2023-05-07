package com.j2se.examples.control.conditional;

import java.util.Scanner;

public class IfStatementExample {
	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		if(age<18) { 
			System.out.println("You are a Minor!");
			System.out.println("let me get you a chocolate!");
		}
		else if(age<60) {
			System.out.println("you are an adult!");
		}
		else {
			System.out.println("You are a senior citizen!");
		}
		
		System.out.println("End");
		
	}
}
