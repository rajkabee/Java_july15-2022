package com.j2se.examples.operators;

public class Operators {
	public static void main(String[] args) {
		int age = 23;
		age = 12+13;
		int rem = 10%3;
		System.out.println("Rem: "+rem);
		
		age=age+10;
		age+=10;
		age%=7;
		System.out.println("age: "+age);
		age=0;
		age=age+1;
		age+=1;
		age++;			//post increment
		++age;			//pre increment
		age--;
		--age;
		System.out.println("age: "+age);
		
		
		int x=23;
		int y = x++;
		System.out.println("x: "+x+", y: "+y);
		y = ++x;
		System.out.println("x: "+x+", y: "+y);
		
		
		System.out.println(age<20);
		
		age=38;
		System.out.println(age>=18 && age<=35);
	}
}

/*
 * Logical Operators
 * A	B	A||B	A&&B
 * 0	0	0		0
 * 0	1	1		0
 * 1	0	1		0
 * 1	1	1		1
 * 
 * not: !
 * A	!A
 * 0	1
 * 1	0
 * byte b=13;
 * 00001101
 * 11110010	one's complement
 * 		+1
 * 11110011	two's Complement
 * 
 * 
 * 
 */
