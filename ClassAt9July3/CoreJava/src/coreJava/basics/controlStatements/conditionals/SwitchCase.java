package coreJava.basics.controlStatements.conditionals;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		int choice;
		System.out.println("Press 1 for  coke and 2 for fanta.");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Coke is served!");
			break;
		case 2:
			System.out.println("Fanta is served");
			break;
		default:
			System.out.println("Invalid Input!");
		}
	}
}
