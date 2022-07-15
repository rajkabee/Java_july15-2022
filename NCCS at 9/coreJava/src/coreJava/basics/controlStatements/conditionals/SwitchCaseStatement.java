package coreJava.basics.controlStatements.conditionals;

import java.util.Scanner;

public class SwitchCaseStatement {
	public static void main(String[] args) {
		System.out.println("Enter a number 1,2 or 3: ");
		int num = new Scanner(System.in).nextInt();
		switch(num) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("Invalid");	
		}
	}
}
