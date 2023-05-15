package j2se.dursikshya.loops;

import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int n=num;
		int count=0;
		while(num!=0) {
			num/=10;
			count++;
		}
		System.out.println("No. of digits: "+count);
		num=n;
		int rev, rem;
		
		//prime
		int i;
		for(i=2; i<=num/2; i++) {
			if(num%i==0) {
				break;
			}
		}
		if(i>num/2) {
			System.out.println("prime");
		}
		else {
			System.out.println("Composite");
		}
		
	}
}


