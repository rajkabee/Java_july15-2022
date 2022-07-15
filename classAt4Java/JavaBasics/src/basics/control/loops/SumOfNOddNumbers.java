package basics.control.loops;

import java.util.Scanner;

public class SumOfNOddNumbers {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n = sc.nextInt();
		int res = 0;
//		for(int i=0; i<n; i++) {
//			res = res+(i*2)+1;
//		}
		int j = 0;
		for(int i=1; j<n; i+=2) {
			res+=i;
			j++;
		}
		System.out.println("Sum of "+n+" odd numbers : "+res+".");
	}
}
