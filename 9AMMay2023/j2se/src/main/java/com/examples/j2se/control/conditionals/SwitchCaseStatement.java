package com.examples.j2se.control.conditionals;

import java.util.Scanner;

public class SwitchCaseStatement {
	public static void main(String[] args) {
		System.out.println("------MENU------");
		System.out.println("a. Americano");
		System.out.println("b. Mochaccino");
		System.out.println("c. Cappuccion");
		System.out.println("d. Hot chocolate");
		System.out.println("Make a choice: ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		/*
		switch(ch) {
		case 'a','b':
			System.out.println("Americano is served!");
			break;
//		case 'b':
//			System.out.println("Mochaccino is served!");
//			break;
		case 'c':
			System.out.println("Cappuccino is served!");
			break;
		case 'd':
			System.out.println("Hot chocolate is served!");
			break;
		default:
			System.out.println("Invalid choice!");
		}
		
		*/
		
		
//		String item=switch(ch) {
//		case 'a':{
//			yield "Americano";
//		}
//		case 'b':{
//			yield "Mochaccino";
//		}
//		case 'c':{
//			yield "Cappuccino";
//		}
//		case 'd':{
//			yield "Hot chocolate";
//		}
//		default:{
//			yield "invalid";
//		}
//		};
		String item=switch(ch) {
		case 'a'-> "Americano";
		
		case 'b'->"Mochaccino";
		
		case 'c'->"Cappuccino";
		
		case 'd'-> "Hot chocolate";
		
		default-> "invalid";
		
		};
		System.out.println(item +" is served!");
	}
}
