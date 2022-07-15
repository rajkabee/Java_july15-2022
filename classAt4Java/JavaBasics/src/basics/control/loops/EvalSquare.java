package basics.control.loops;

import java.util.Scanner;

public class EvalSquare {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 0;
		while(i*i<n) {
			i++;
		}
		if(i*i==n) {
			System.out.println("The number is a square number.");
		}else {
			System.out.println("The number is not a square number.");
		}
		
	}
}
