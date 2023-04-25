package j2se.eclipse.loops;

import java.util.Scanner;

public class PowerExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base: ");
		int b = sc.nextInt();	//2
		System.out.println("Enter the power: ");
		int p = sc.nextInt();	//5
		int pv = 1;//1*b*b*b*b*b
//		int i =1;
//		while(i<=p) {
//			pv=pv*b;
//			i++;
//		}
		
		while(p>0) {
			pv=pv*b;
			p--;
		}
		
		System.out.println("Power Value: "+pv);
	}
}
