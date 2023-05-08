package c0m.dursikshya.j2se.conditionals;

import java.util.Scanner;

public class SwitchCaseStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------Menu------");
		System.out.println("a. Americano");
		System.out.println("b. Mochaccino");
		System.out.println("c. Cappuccino");
		System.out.println("d. Hot Chocolate");
		System.out.println("e. Espresso");
		System.out.println("Make a choice: ");
		char ch = sc.next().charAt(0);
		String treat = switch (ch) {
		case 'a','b':
			System.out.println("Americano is served");
			yield "Whole grain cookies";
//		case 'b':
//			System.out.println("Mochaccino is served");
//			yield "Chocolate Chips Cookie";
		case 'c':
			System.out.println("Cappuccino is served");
			yield "Apple Pie";
		case 'd':
			System.out.println("Hot Chocolate is served");
			yield "Chocolate Chips Cookie";

		case 'e':
			System.out.println("Espresso is served");
			yield "Chocolate Chips Cookie";
		default:
			System.out.println("Invalid Choice!");
			yield "";
		};
		System.out.println(treat);
		
	}
}
