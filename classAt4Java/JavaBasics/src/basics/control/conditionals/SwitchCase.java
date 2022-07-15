package basics.control.conditionals;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		System.out.println("Enter a choice: \n 1. Coke \n 2. Beer \n 3. Coffee \n:-");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Kids Can't have Coke!");
			break;
		case 2:
			System.out.println("Spoilt kids drink beer!");
			break;
		case 3:
			System.out.println("So you think yourself a geek!");
			break;
		default:
			System.out.println("Good, go home now!");
		}
	}
}
