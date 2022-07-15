package coreJava.basics.controlStatements.conditionals;

import java.util.Scanner;

public class IfStatement {
	public static void main(String[] args) {
		System.out.println("Enter your obtained percentage is see: ");
		Scanner sc = new Scanner(System.in);
		float percentage = sc.nextFloat();
		if(percentage>=80) {
			System.out.println("You are good to go with Science.");
		}
		else if(percentage>=60) {
			System.out.println("Go for commerce, you will do better!");;
		}
		else {
			System.out.println("go for something else");
		}
	}
}
