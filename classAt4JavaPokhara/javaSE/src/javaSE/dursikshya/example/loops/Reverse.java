package javaSE.dursikshya.example.loops;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		int num, rem, rev=0, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();
//		while(num!=0) {
//			rem = num%10;
//			rev = rev*10+rem;
//			//System.out.println(rem);
//			num/=10;
//		}
		for(i=num; i>0; i/=10) {
			rem=i%10;
			rev=rev*10+rem;
		}
		
//		for(num = sc.nextInt(); num>0; num/=10) {
//			rem=num%10;
//			rev=rev*10+rem;
//		}
		System.out.println("Reverse: "+rev);
		
		if(num==rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome!");
		}
	}
}
