package javaSE.dursikshya.example.loops;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int d=0, t, rem, i, pv, armv=0;
		for(t=num;t>0; t/=10) {
			d++;
		}
		//System.out.println("Number of digits: "+d);
		
		for(t=num; t>0; t/=10) {
			rem=t%10;
			pv=1;
			for(i=0; i<d; i++) {
				pv*=rem;
			}
			armv+=pv;
		}
		
		//System.out.println("Armstrong Value: "+armv);
		
		if(armv==num) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong number!");
		}
	}
}

/*
 * 153
 * no.of digits=3
 * 
 * 1^3+5^3+3^3
 * 1+125+27
 * 153
 * 
 */
