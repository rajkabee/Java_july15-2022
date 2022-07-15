package basics.control.function.recursive;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		int sum = sumNatural(num);
		System.out.println("Sum of "+num+" Natural numbers: "+sum);
	}

	private static int sumNatural(int num) {
		if(num==1||num==0) {
			return num;
		}
		else {
			return num+sumNatural(num-1);
		}
		
	}
}
