package javaBasics.controlStatement.loops;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		int i, j, num;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter a number: ");
			num = sc.nextInt();
			for(j=1; j<=10; j++) {
				System.out.println(num+"x"+j+"="+(num*j));
			}
			
			System.out.println("Enter 1 to continue and 0 to exit: ");
			do {
				i=sc.nextInt();
			}while(!(i==1 || i==0));
		}while(i==1);
		
		
	}
}
