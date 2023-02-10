package myFirstJavaProject.loops;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		if(num==0 || num==1) {
			System.out.println("The number is neither prime nor composite!");
		}
		else {
			int i, flag=0;
			for(i=2; i<=num/2; i++) {
				if(num%i==0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println("Prime");
			}else {
				System.out.println("Composite");
			}
		}
		
	}
}
