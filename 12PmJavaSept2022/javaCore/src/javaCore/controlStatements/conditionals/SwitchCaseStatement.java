package javaCore.controlStatements.conditionals;

import java.util.Scanner;

public class SwitchCaseStatement {
	public static void main(String[] args) {
		System.out.println("------Main Menu------");
		System.out.println("1. Chocolat Chips Cookie");
		System.out.println("2. Multi Grain Brown Bread");
		System.out.println("3. Butter Cookies");
		System.out.println("4. Ajwain Jeera Cookie");
		System.out.println("5. Fruits and Nuts Cookie");
		
		System.out.println("Your Choice: ");
		int i = new Scanner(System.in).nextInt();
		
		switch(i) {
		case 1:
			System.out.println("You are served with Chocolate chips cookie."
					+ " your bill amount is Rs.120.");
			break;
			
		case 2:
			System.out.println("You are served with Multi Grain Brown Bread."
					+ " your bill amount is Rs.150.");
			break;
		case 3:
			System.out.println("You are served with Butter Cookies."
					+ " your bill amount is Rs.100.");
			break;
		case 4:
			System.out.println("You are served with Ajwain Jeera Cookies."
					+ " your bill amount is Rs.100.");
			break;
		case 5:
			System.out.println("You are served with Fruits and Nuts Cookies."
					+ " your bill amount is Rs.200.");
			break;
		default:
			System.out.println("sorry, we dont have anything you want to enjoy!");
		}
	}
}
