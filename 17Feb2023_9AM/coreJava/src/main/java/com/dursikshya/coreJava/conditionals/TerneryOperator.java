package com.dursikshya.coreJava.conditionals;

import java.util.Scanner;

public class TerneryOperator {
	public static void main(String[] args) {
		int age;
		System.out.println("Enter your age: " );
		Scanner sc = new Scanner(System.in);
		age=sc.nextInt();
//		String message = age<18?"Minor":"Adult";	//ternery operator
		String message = age<18?"Minor": age<60?"Adult":"Senior Citizen";
		System.out.println("You are a "+message);
	}
}
// condition? if true:if false