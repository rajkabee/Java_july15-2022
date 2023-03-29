package javaSE.dursikshya.example.operators;

import java.util.Scanner;

public class TerneryOperatorExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		//String msg = age<18?"You are a minor!":"You are an adult!";
		String msg = age<18?"You are a minor!":age<60?"You are an adult!":"You are a senior citizen!";
		System.out.println(msg);
	}
	
	/*
	 * ternery operator syntax
	 * 
	 * condition?if_true:if_false
	 * 
	 */
}
