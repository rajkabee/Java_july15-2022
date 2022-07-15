package basics.control.loops;

import java.util.Scanner;

public class FibonacciSeriesRange {
	public static void main(String[] args) {
		int n1, n2, n3, range;
		n1=0;
		n2=1;
		System.out.println("Enter the range of fibonacci series: ");
		range = new Scanner(System.in).nextInt();
		while(n1<=range) {
			System.out.println(n1);
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
	}
}
