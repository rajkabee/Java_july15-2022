package com.examples.j2se.control.loops;

public class perfect {
	public static void main(String[] args) {
		int i,j,sum;
		for(i=1; i<1000; i++) {
			sum=0;
			for(j=1; j<=i/2; j++) {
				if(i%j==0) {
					sum+=j;
				}
			}
			if(i==sum) {
				System.out.println(i);
			}
		}
	}
}
