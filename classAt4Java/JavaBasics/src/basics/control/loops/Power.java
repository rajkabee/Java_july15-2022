package basics.control.loops;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		System.out.println("Enter the Base: ");
		Scanner sc = new Scanner(System.in);
		int base  = sc.nextInt();
		System.out.println("Enter the power: ");
		int pow = sc.nextInt();
		int res = 1;	//2, 4, 8, 16, 32
		while(pow!=0) {
			res*=base;
			pow--;		//4, 3, 2, 1, 0
		}
		System.out.println("Result: "+res);
		
	}
}
