package com.rajkabee.mavenHelloWorld.introduction;

public class Operators {
	public static void main(String[] args) {
		System.out.println();
		int y = 3;
		int x = (34+23)/y;
		y = 3+5;
		x=33-y;
		
		
	}
}
/*

	Operators
		=	assignment operator
			assigns the value in the right to the variable in the left
		Arithmetic Operators
			+
			-
			/
			*
			%	modulus ->Remainder
			combination operators
				x=x+5;	x+=5;
				x=x/5;	x/=5;
				+=
				-=
				/=
				*=
				%=
			unary increment decrement operator
				++	x=x+1;	x+=1;	x++;	++x;
				--	x=x-1;	x-=1;	x--;	--x
			x=4;
			y=x++;	y=4; x=5;
			y=++x;	x=5; y=5;
				
		Conditional Operators(o/p=>true/false)
			<
			>
			==
			<=
			>=
			
		Logical Operators
			AND	&&
			OR	||
			NOT	!
			XOR	^
		A	B	A&&B	A||B	A^B
		0	0	 0		 0		 0
		0	1	 0		 1		 1
		1	0	 0		 1		 1
		1	1	 1		 1		 0
		
		A	!A
		0	1
		1	0
		
		Bitwise Operators
		<<	left shift
		>>	right shift
		&
		|
		^
		~	complement
		>>>	signed right shift
		
		x=10
		00001010
		00010100
		00000101
		10111 & 01101
		00101
		11010
*/