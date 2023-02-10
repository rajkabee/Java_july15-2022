package javaBasics.intro;

public class OperatorsInJava {
	public static void main(String[] args) {
		/*
		 *  = ->assignment operator
		 *  x+y=5;	->equation not a statement can't be used in a program
		 *  x=y%45;	->equation and a statement in a program
		 *  
		 *  Arithmetic Operators
		 *  +
		 *  -
		 *  /
		 *  *
		 *  % -> modulus/gives remainder
		 *  x=15%6;   x=>3
		 *  
		 *  Combination Operator
		 *  x=x+5;	===  x+=5;
		 *  +=
		 *  -=
		 *  /=
		 *  *=
		 *  %=   x=15; x%=6; x=>3;
		 *  
		 *  Unary Operator
		 *  x=x+1; === x+=1; === x++;
		 *  
		 *  ++	->increment operator
		 *  --	->decrement operator
		 *  
		 *  x++;	post increment
		 *  ++x;	pre increment
		 *  x--;
		 *  --x;
		 *  
		 *  x=13;
		 *  y=x++;	y->13	,x->14
		 *  z=++y;	y->14	,z->14
		 *  
		 *  
		 *  Conditional Operator
		 *  ==		equals to operator
		 *  int x=5;
		 *  float f = 5f;
		 *  <		
		 *  >
		 *  <=
		 *  >=
		 *  
		 *  
		 *  logical operator
		 *  A	B	A&&B	A||B	A^B
		 *  0	0	0		0		0
		 *  0	1	0		1		1
		 *  1	0	0		1		1
		 *  1	1	1		1		0
		 *  
		 *  NOT
		 *  A	!A
		 *  0	1
		 *  1	0
		 *  
		 *  
		 *  
		 *  
		 */
		
		
		int i=5;
		float f=5f;
		if(i==f) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		
	}
}
