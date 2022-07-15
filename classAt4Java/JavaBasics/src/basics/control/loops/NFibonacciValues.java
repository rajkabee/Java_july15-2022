package basics.control.loops;

import java.util.Scanner;

public class NFibonacciValues {
	public static void main(String[] args) {
		int n1, n2, n3, num, count;
		n1=0;
		n2=1;
		System.out.println("Enter the range of fibonacci series: ");
		num = new Scanner(System.in).nextInt();
		count=0;
		while(count<num) {
			System.out.println(n1);
			n3=n1+n2;
			n1=n2;
			n2=n3;
			count++;
		}
	}
}
