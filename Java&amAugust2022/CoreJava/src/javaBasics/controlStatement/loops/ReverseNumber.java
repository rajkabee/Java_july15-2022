package javaBasics.controlStatement.loops;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();				//num=123;
		int rev=0,rem;
		
		while(num!=0) {
			rem=num%10;							//3		2		1
			rev = rev*10+rem;					//3		32		321		
			num/=10;							//12	1		0
			
		}
		
		System.out.println("Reversed number : "+rev);
		
	}
}
