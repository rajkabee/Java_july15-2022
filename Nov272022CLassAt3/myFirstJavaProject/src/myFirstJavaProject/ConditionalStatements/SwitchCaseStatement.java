package myFirstJavaProject.ConditionalStatements;

import java.util.Scanner;

public class SwitchCaseStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Make a choice: ");
		System.out.println("a. Americano");
		System.out.println("b. Cafe Latte");
		System.out.println("c. Cappuccino");
		System.out.println("d. Hot Chocolate");
		System.out.print("Choice: ");
		char ch = sc.next().charAt(0);
		switch(ch) {
			case 'a':
				System.out.println("Americano is served!");
				break;
			case 'b':
				System.out.println("Cafe Latte is served!");
				break;
			case 'c':
				System.out.println("Cappuccino is served!");
				break;
			case 'd':
				System.out.println("Hot Chocolate is served!");
				break;
			default:
				System.out.println("Invalid choice!");
		}
		
	}
}
