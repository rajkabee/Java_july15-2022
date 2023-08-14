package com.rajkabee.j2se.control.conditional;

import java.util.Scanner;

public class SwitchCaseStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------MENU------");
		System.out.println("a. Steam Momo");
		System.out.println("b. Fry Momo");
		System.out.println("c. Jhol Momo");
		System.out.println("d. Chilly Momo");
		char ch = sc.next().charAt(0);
		
		String treat = switch(ch) {
		case 'a'->{
			System.out.println("Steam Momo is served!");
			yield  "Soup";
		}
		case 'b'->{
			System.out.println("Fry Momo is served!");
			yield "Soup";
		}
		case 'c','d'->{
			System.out.println("Chilly Momo is served!");
			yield "Soup";
		}
		default->{
			System.out.println("Invalid input!");
			yield "nothing";
		}
		};
		System.out.println("enjoy "+treat);
	}
}
