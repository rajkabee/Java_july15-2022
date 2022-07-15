package basics.control.function;

import java.util.Scanner;

public class DigitsFinc {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		int rev = reverse(num);
		if(rev==num) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not Palindrome");
		}
		
	}
	public static int reverse(int num) {
		int i=0;
		while(num!=0) {
			i=i*10+(num%10);
			num/=10;
		}
		return i;
	}
}
