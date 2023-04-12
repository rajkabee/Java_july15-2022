package javaSE.dursikshya.example.loops;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		int num, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		if(num<2) {
			System.out.println("Neither prime nor composite!");
		}
		else {
			for(i=2; i<num; i++) {
				if(num%i==0) {
					//composite
					break;
				}
			}
			if(i==num) {
				System.out.println("Prime number!");
			}
			else {
				System.out.println("Composite!");
			}
		}
		
	}
}
