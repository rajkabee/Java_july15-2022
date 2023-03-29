package com.dursikshya.coreJava.conditionals;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		System.out.println("------MENU------");
		System.out.println("a. Americano");
		System.out.println("b. Mochaccion");
		System.out.println("c. Cappuccino");
		System.out.println("d. Hot Chocolate");
		System.out.println("e. Cafe Latte");
		System.out.println("Choice: ");
		Scanner sc = new Scanner(System.in);
		char ch=sc.next().charAt(0);
		sc.close();
		
		switch(ch) {
		case 'a':
			System.out.println("Americano is served!");
			break;
		case 'b':
			System.out.println("Mochaccino is served!");
			break;
		case 'c':
			System.out.println("Cappuccion is served!");
			break;
		case 'd':
			System.out.println("Hot chocolate is served!");
			break;
		case 'e':
			System.out.println("Cafe latte is served!");
			break;
		default:
			System.out.println("Invalid choice!");
		}
	}
}
