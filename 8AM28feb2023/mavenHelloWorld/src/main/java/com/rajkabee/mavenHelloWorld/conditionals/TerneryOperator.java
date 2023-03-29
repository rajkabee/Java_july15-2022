package com.rajkabee.mavenHelloWorld.conditionals;

import java.util.Scanner;

public class TerneryOperator {
	public static void main(String[] args) {
		System.out.println("Enter your age: ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		//String msg = age<18?"Minor":"Adult";	//ternery operator(? :)
		String msg = age<18?"Minor":age<60?"Adult":"Senior";	//ternery operator(? :)
		
		System.out.println(msg);
	}
}
