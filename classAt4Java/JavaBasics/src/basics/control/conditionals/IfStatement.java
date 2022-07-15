package basics.control.conditionals;

import java.util.Scanner;

public class IfStatement {
	public static void main(String[] args) {
		System.out.println("How old are you?");
		int age = new Scanner(System.in).nextInt();
		if(age>60) {
			System.out.println("You are a senior citizen!");
		}else if(age>18) {
			System.out.println("You are a valued citizen!");
		}else {
			System.out.println("You are a minor!");
		}
	}
}
