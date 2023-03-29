package javaSE.dursikshya.example.conditionals;

import java.util.Scanner;

public class SwitchStatementExample {
	public static void main(String[] args) {
		System.out.println("------MENU------");
		System.out.println("a. Americano");
		System.out.println("b. Cappuccino");
		System.out.println("c. Cafe Latte");
		System.out.println("Choice: ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		switch(ch) {
		case 'a':
			System.out.println("Americano is served!");
			break;
		case 'b':
			System.out.println("Cappuccino is served!");
			break;
		case 'c':
			System.out.println("Cafe Latte is served!");
			break;
		default:
			System.out.println("Invalid choice!");
			
		}
		
	}
}
