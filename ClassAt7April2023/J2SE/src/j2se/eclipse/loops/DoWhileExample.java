package j2se.eclipse.loops;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		int i=0;
		do {
			System.out.println(i+". Do While Loop...");
			i++;
		}while(i<5);
		
		char ch;
		int a, b;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter two numbers: ");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println(a+" + "+b+" = "+(a+b));
			do {
				System.out.println("Do you want to continue(y/n)? ");
				ch= sc.next().charAt(0);
			}while(!(ch=='y'||ch=='n'));
		}while(ch=='y');
		
		System.out.println("Thank You!");
	}
}
