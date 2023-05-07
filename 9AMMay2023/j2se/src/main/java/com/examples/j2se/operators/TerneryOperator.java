package com.examples.j2se.operators;

import java.util.Scanner;

public class TerneryOperator {
	public static void main(String[] args) {
		System.out.println("Enter your age:");
		int age = new Scanner(System.in).nextInt(); 
		//String msg = age<18?"Minor":"adult";
		String msg = age<18?"Minor":age<60?"adult":"senior";
		System.out.println(msg);
	}
}
//result = con?if_true:if_false;