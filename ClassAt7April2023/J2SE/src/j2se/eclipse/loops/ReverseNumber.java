package j2se.eclipse.loops;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();		//1234
		int rem, rev=0;
		
		while(num>0) {
			rem=num%10;	
			rev=rev*10+rem;	
			num=num/10;	
		}
		System.out.println("Reversed Number: "+rev);
		
		
	}
}
