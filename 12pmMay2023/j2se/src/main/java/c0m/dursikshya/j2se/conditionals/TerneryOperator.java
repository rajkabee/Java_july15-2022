package c0m.dursikshya.j2se.conditionals;

import java.util.Scanner;

public class TerneryOperator {
	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age=sc.nextInt();
		String msg=(age<18)? "You are a minor!, Let me get you a chocolate!"
						:age<60?"You are an adult!"
						:"You are a Senior citizen!";
//		
		
		System.out.println(msg);
	}
}

/*
 syntax: 
 res = con?if_true:if_false; 
 
 */
