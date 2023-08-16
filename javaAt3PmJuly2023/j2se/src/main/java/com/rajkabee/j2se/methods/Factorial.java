package com.rajkabee.j2se.methods;

public class Factorial {
	public static void main(String[] args) {
		int n=12;
		int result = fact(n);
		System.out.println("Factorial: "+result);
	}
	
	
	static int fact(int x){
		int res=1;
		while(x>0) {
			res*=x;
			x--;
		}
		return res;
	}
}
