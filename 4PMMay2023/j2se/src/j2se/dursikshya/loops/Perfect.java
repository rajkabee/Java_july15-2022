package j2se.dursikshya.loops;

import java.util.Scanner;

public class Perfect {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int pv=0, i;
		for(i=1; i<num; i++) {
			if(num%i==0) {
				pv+=i;
				System.out.println(i);
			}
		}
		if(pv==num) {
			System.out.println("Perfect");
		}
		else {
			System.out.println("Not Perfect!");
		}
	}
}
