package j2se.dursikshya.conditionals;

import java.util.Scanner;

public class SwitchCaseStatement {
	public static void main(String[] args) {
		System.out.println("------MENU-----");
		System.out.println("a. Americano");
		System.out.println("b. Mochaccino");
		System.out.println("c. Cappuccino");
		System.out.println("Make a choice: ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		String treat = switch(ch) {
		case 'a', 'd':
			System.out.println("Americano is served!");
			yield "Choco Chips cokie";
			
		case 'b':
			System.out.println("Mochaccino is served!");
			yield "Whole grain cookie";
			
		case 'c':
			System.out.println("Cappuccino is served!");
			yield "Little Hearts";
			
		default:
			System.out.println("Invalid choice!");
			yield "Nothing...";
			
		};
		System.out.println(treat);
	}
}
