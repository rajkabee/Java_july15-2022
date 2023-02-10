package javaBasics.controlStatement.loops;

import java.util.Scanner;

public class HcfLcm {
	public static void main(String[] args) {
		System.out.println("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int hcf, lcm;
		int x=a, y=b,t;
		while(x%y!=0) {
			t=x%y;
			x=y;
			y=t;
		}
		hcf=y;
		
		
		
		
		
		/*
		for(hcf=a; hcf>0; hcf--) {
			if(a%hcf==0 && b%hcf==0) {
				break;
			}
		}
		*/
		System.out.println("HCF: "+hcf);
		//for(lcm=a; !(lcm%a==0 && lcm%b==0);lcm++);
		lcm = (a*b)/hcf;
		System.out.println("LCM: "+lcm);
		
		
		
		
		
	}
}
/*
12, 16

t		x		y
12		16		12
4		12		4
*/
