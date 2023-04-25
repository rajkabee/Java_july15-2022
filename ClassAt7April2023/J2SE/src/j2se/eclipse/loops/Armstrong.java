package j2se.eclipse.loops;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		System.out.println("Enter a armstrong number: ");
		int num = new Scanner(System.in).nextInt();
		/*
		123
		no. of digits: 3;
		AV=1^3+2^3+3^3=1+8+27=36
		123!=36
		
		153
		AV=1+125+27=153
		AV==Given number
		*/
		int d, t;
		t=num;
		d=0;
		while(t>0) {
			d++;
			t/=10;
		}
		//System.out.println("No. of digits: "+d);
		int av = 0, rem, i, pv;
		t=num;
		while(t>0) {
			rem=t%10;
			i=0;
			pv=1;
			while(i<d) {
				pv*=rem;
				i++;
			}
			av+=pv;
			t/=10;
		}
		
		//System.out.println("Armstrong Value: "+av);
		if(av==num) {
			System.out.println("You entered a armstrong number!");
		}
		else {
			System.out.println("the number you entered is not a armstrong number!");
		}
		
	}
}
