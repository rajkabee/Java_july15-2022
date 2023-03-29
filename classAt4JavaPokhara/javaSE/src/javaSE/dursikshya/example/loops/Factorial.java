package javaSE.dursikshya.example.loops;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fact=1;
		while(num!=0) {
			fact*=num;
			num--;
		}
		System.out.println("Factorial: "+fact);
	}
}
