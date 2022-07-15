package coreJava.basics.controlStatements.conditionals;

import java.util.Scanner;

public class IfStatement {
	public static void main(String[] args) {
		System.out.println("Enter your age: ");
		int age = new Scanner(System.in).nextInt();
		if(age>60) {
			System.out.println("Senoir citizen!");
		}else if(age>=18) {
			System.out.println("Adult");
		}else {
			System.out.println("Minor");
		}
	}
}
