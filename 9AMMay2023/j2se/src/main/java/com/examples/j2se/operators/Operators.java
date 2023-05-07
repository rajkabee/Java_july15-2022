package com.examples.j2se.operators;

public class Operators {
	public static void main(String[] args) {
		int x =45;
		int y = x%4;
		System.out.println(y);
		//x=x/9;
		x/=9;
		x=x+1;
		x+=1;
		x++;
		++x;
		System.out.println(x);
		y=x++;
		System.out.println("x: "+x+", y: "+y);
		y=++x;
		System.out.println("x: "+x+", y: "+y);
		System.out.println(x==y);
		
		
		/*
		 A	B	A&&B	A||B
		 0	0	0		0
		 0	1	0		1
		 1	0	0		1
		 1	1	1		1	
		 
		 A	!A
		 0	1
		 1	0
  
  
  
  
*/
		
		
		
	}
}
