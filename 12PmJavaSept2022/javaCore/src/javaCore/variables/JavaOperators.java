package javaCore.variables;

public class JavaOperators {
	public static void main(String[] args) {
		int x = 5<2?100:200;
		System.out.println(x);
	}
	
	
	/*
	 
	 Operators on java
	 
	 =			x=5;
	 Arithmetic Operators
	 	+
	 	-
	 	/
	 	*
	 	%	->modulus operator ->remainder
	 	
	 	combination operator
	 		+=		x=5; x+=10; 		x->15
	 		-=
	 		/=
	 		*=
	 		%=		x=13; x%=5;			x->3
	 		
	 	unary Operator
	 		++		x=5;  x++;			x->6;
	 		--		x=5;  x--;			x->4;
	 		
	 		x++;	==	++x;
	 		x--;	==	--x;
	 		
	 		
	 		x=5;
	 		y=x++;		y=5; x=6;		->post-increment
	 		z=++y;		y=6; z=6;		->pre-increment
	 		
	 Conditional operator
	 	==
	 	<
	 	>
	 	<=
	 	>=
	 	!=
	 	!<
	 	!>
	 
	 logical operators
	 	A	B	A||B	A&&B	A^B
	 	0	0	0		0		0
	 	0	1	1		0		1
	 	1	0	1		0		1
	 	1	1	1		1		0
	 	
	 	A	!A
	 	0	1
	 	1	0
	 	
	 	Ternery operator
	 	condition?iftrue:ifFalse;
	 */
}
