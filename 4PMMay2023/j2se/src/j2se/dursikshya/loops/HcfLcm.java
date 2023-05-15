package j2se.dursikshya.loops;

import java.util.Scanner;

public class HcfLcm {
	public static void main(String[] args) {
		System.out.println("Enter two number: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
//		int hcf=1, i=2;
//		while(i<=x) {
//			if(x%i==0 && y%i==0) {
//				hcf=i;
//			}
//			i++;
//		}
		while(x%y!=0) {
			x=x%y;
			//swap
			x+=y;
			y=x-y;
			x-=y;
		}
		
		System.out.println("HCF: "+y);
	}
}
