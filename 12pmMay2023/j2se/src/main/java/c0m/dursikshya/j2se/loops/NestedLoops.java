package c0m.dursikshya.j2se.loops;

import java.util.Scanner;

public class NestedLoops {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		int i, num;
		for(num=2; num<=range; num++) {
			for(i=2; i<num; i++) {
				if(num%i==0) {	
					break;
				}
			}
			
			if(i==num) {
				System.out.println(num);
			}
		}
	}
}
