package basics.control.loops;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		int flag = 0;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count=0;
		for(int n=2; count<num; n++) {
			flag = 0;
			for(int i=2; i<=n/2; i++) {
				if(n%i==0) {
					flag = 1;
					break;
					}
				}
				if(flag==0) {
					System.out.println(n);
					count++;
				}
				
				
		}
	}
}
