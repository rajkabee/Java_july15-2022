package j2se.eclipse.loops;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int sum=0;
		int i=1;
		while(i<=num) {
			sum=sum+i;
			i++;
		}
		System.out.println("Sum Of "+num+" Natural numbers: "+sum);
		
	}
}
