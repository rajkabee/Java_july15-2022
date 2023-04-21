package j2se.eclipse.conditionals;

import java.util.Scanner;

public class Loksewa {
	public static void main(String[] args) {
		int age;
		System.out.println("Enter your age: ");
		Scanner sc = new Scanner(System.in);
		age=sc.nextInt();
		if(age>=18 && age<=35) {
			System.out.println("You are eligible to fill up the form!");
		}
		
	}
}
