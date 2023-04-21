package j2se.eclipse.conditionals;

import java.util.Scanner;

public class SwitchCaseStatement {
	public static void main(String[] args) {
		System.out.println("------MENU------");
		System.out.println("a. Americano");
		System.out.println("b. Cafe Latte");
		System.out.println("c. Cappuccino");
		System.out.println("d. Mochaccino");
		System.out.println("e. Hot Chocolate");
		Scanner sc = new Scanner(System.in);
		System.out.println("Make a choice: ");
		char ch = sc.next().charAt(0);
		String msg=switch(ch) {
					case 'a':
						System.out.println("Americano is seved!");
						yield "Good Choice";
						
					case 'b':
						System.out.println("Cafe Latte is seved!");
						
					case 'c','d','e':
						System.out.println("Cappiuccino is seved!");
						yield "we are short on coaca!";
						
					default:
						System.out.println("Invalid Choice!");
						yield "have a good day";
					};
		System.out.println(msg);
		
	}
}
