package javaSE.dursikshya.example.loops;

import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rem, dig=0;
		while(num>0) {
			rem=num%10;
			System.out.println(rem);
			dig++;
			num/=10;
		}
		System.out.println("number of digits: "+dig);
		
	}
}	
