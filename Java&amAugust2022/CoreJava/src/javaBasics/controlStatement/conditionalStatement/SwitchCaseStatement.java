package javaBasics.controlStatement.conditionalStatement;

import java.util.Scanner;

public class SwitchCaseStatement {
	public static void main(String[] args) {
		System.out.println("---MENU---");
		System.out.println("a. Americano");
		System.out.println("b. Mochaccino");
		System.out.println("c. Cappuccing");
		System.out.println("d. Hot Chocolate");
		System.out.println("e. Cafe Latte");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Make a choice: ");
		char ch = sc.next().charAt(0);
		switch(ch) {
		case 'a':
			System.out.println("Americano is served!");
			break;
		case 'b':
			System.out.println("Mochaccino is served!");
			break;
		case 'c':
			System.out.println("Cappuccino is served!");
			break;
		case 'd':
			System.out.println("Hotchocolate is served!");
			break;
		case 'e':
			System.out.println("Cafe Latte is served!");
			break;
		default:
			System.out.println("Invalid input!");
		}

	}
}
