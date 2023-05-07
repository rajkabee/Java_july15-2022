package com.j2se.examples.control.conditional;

import java.util.Scanner;

public class SwitchCaseStatement {
	public static void main(String[] args) {
		System.out.println("------MENU------");
		System.out.println("a. Americano");
		System.out.println("b. Mochaccino");
		System.out.println("c. Cappuccino");
		System.out.println("Make a choice: ");
		char ch = new Scanner(System.in).next().charAt(0);
		String treat = switch(ch) {
		case 'a','b':
			//System.out.println("Americano is served!");
			yield "Whole Grain Cookie";
			
		case 'd':
			//System.out.println("Mochaccino is served!");
			yield "Chocolate cookie";
			
		case 'c':
			//System.out.println("Cappuccino is served!");
			yield "Toast";
	
		default:
			//System.out.println("Invalid input...");
			yield "nothing";
		};
		System.out.println("with "+treat);
	}
}
