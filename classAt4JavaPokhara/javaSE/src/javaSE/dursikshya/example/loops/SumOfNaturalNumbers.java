package javaSE.dursikshya.example.loops;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum=0;
		while(num!=0) {
			sum+=num;
			num--;
		}
		System.out.println("sum: "+sum);
	}
}
