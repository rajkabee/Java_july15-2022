package basics.control.loops;

import java.util.Scanner;

public class PrimeNumbersInTheGivenRange {
	public static void main(String[] args) {
		int n, num;
		System.out.println("Enter the range: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for(n=2; n<=num; n++) {
			int flag = 0;
			int i = 2;
			while(i<=n/2) {
				if(n%i==0) {
					flag=1;
					break;
				}
				i++;
			}
			if(flag==0) {
				System.out.println(n);
			}
		}
		
	}
}
