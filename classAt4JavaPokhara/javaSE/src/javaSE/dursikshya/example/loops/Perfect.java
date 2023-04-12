package javaSE.dursikshya.example.loops;

import java.util.Scanner;

public class Perfect {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int i=1, pv=0;
		while(i<=num/2) {
			if(num%i==0) {
				pv+=i;
			}
			
			i++;
		}
		if(pv==num) {
			System.out.println("Perfect number!");
		}
		else {
			System.out.println("Not a perfect number!");
		}
		
	}
}
