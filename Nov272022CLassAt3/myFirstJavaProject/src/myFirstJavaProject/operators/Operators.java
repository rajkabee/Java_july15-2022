package myFirstJavaProject.operators;

public class Operators {
	public static void main(String[] args) {
		int x,y;
		y = 5;	//assignment Operator
		x = 23;
		x = x*5;	//x*=5;
		x = x%2;	//x%=2;
		System.out.println(x);
		int age = 16;
		String msg = age>17?"Adult":"Minor";	//ternery Operator
		System.out.println(msg);
		/*
		Arithmetic Operators
			+
			-
			/
			*
			%
			combination operator
			+=
			-=
			/=
			*=
			%=
			Unary Operator
			++	x=x+1;	x+=1; 	x++;	++x;
			--
			
			
			Conditional Operator(Always Returns True|False)
			==	equals to operator	x==y
			<
			>
			<=
			>=
			!=	not equals to
			
			
			Logical Operator
			A	B	A&&B	A||B	A^B
			0	0	0		0		0
			0	1	0		1		1
			1	0	0		1		1
			1	1	1		1		0
			
			A	!A
			0	1
			1	0
			
			Ternery Operator
			int age = 26;
			String msg = age>17?"Adult":"Minor";

		*/
	}
	
}
