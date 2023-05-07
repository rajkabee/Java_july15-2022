package com.examples.j2se.control.conditionals;

import java.util.Scanner;

public class IfStatement {
	public static void main(String[] args) {
		System.out.println("Enter your age:");
		int age = new Scanner(System.in).nextInt(); 
		if(age<18) { 
			System.out.println("You are a minor!");
			System.out.println("let me get you a chocolate!");
		}
		else if(age<60) {
			System.out.println("You are a adult!");
		}
		else {
			System.out.println("You are a senior citizen!");
		}
		
		

		
	}
}
