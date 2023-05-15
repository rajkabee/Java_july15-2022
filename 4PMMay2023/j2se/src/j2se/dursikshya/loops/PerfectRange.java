package j2se.dursikshya.loops;

import java.util.Scanner;

public class PerfectRange {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		for(int num=1; num<=range; num++) {
			int pv=0, i;
			for(i=1; i<num; i++) {
				if(num%i==0) {
					pv+=i;
				}
			}
			if(pv==num) {
				System.out.println(num);
			}
		}
	}
}
