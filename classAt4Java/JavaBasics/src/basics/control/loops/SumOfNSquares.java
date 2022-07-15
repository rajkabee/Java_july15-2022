package basics.control.loops;

import java.util.Scanner;

public class SumOfNSquares {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1; i<=n; i++) {
			sum+=i*i;
		}
		System.out.println("The sum on n squares: "+sum);
		
	}
}
