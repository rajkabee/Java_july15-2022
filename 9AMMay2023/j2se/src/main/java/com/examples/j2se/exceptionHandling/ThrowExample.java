package com.examples.j2se.exceptionHandling;

import java.util.Scanner;

public class ThrowExample {
	public static void main(String[] args) throws Exception {
		
			System.out.println("enter a number between 1 and 5");
			int x = new Scanner(System.in).nextInt();
			if(x<=5&&x>=1) {
				System.out.println("Good choice!");
			}
			else {
				throw(new Exception("Invalid input!"));
			}
			try {
				myFunction();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
	static private void myFunction() throws ClassNotFoundException {
		Class.forName("sdsadas");

	}
}
