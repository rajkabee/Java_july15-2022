package javaSE.dursikshya.example.methods;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int n1=0, n2=1, n3;
		int pos, range;
		System.out.println("Enter the position of fibonacci series value: ");
		pos=new Scanner(System.in).nextInt();
		int res = fib(10);
		System.out.println(res);
		
		
//		while(pos>1) {
//			n3=n1+n2;
//			n1=n2;
//			n2=n3;
//			pos--;
//			
//		}
//		System.out.println(n1);
		//0,1,1,2,3,5,8,13,21,34,55
		
//		System.out.println("Enter the range of fibonacci series: ");
//		range=new Scanner(System.in).nextInt();
//		while(n1<=range) {
//			System.out.println(n1);
//			n3=n1+n2;
//			n1=n2;
//			n2=n3;
//		}
	}

	private static int fib(int n) {
		if(n==1) {
			return 0;
		}
		if(n==2) {
			return 1;
		}
		
		
		return fib(n-1)+fib(n-2);
	}
	
	/*
	 * fib(5)
	 * fib(3)+fib(4)
	 * fib(2)+fib(1)+fib(3)+fib(2)
	 * 1+0+ fib(2)+fib(1)+1
	 * 1+1+0+1
	 * 3
	 */
	
	
}
