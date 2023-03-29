package javaSE.dursikshya.example.operators;

public class Operators {
	public static void main(String[] args) {
		int x;
		x=45+34;
		
		x=13;
		x++;
		System.out.println("x: "+x);
		int y=x++;
		System.out.println("x: "+x+", y: "+y);
		int z=++y;
		System.out.println("y: "+y+", z: "+z);
		
		boolean con = 1>5;
		System.out.println("Con: "+con);
	}
}
/*
 
	Operators
		=		Assignment Operator
		x=45+23		whatever there is on rhs is assigned to left hand side;
		
		x+23=57;	XXX
		
		a=45;
		b=67;
		x=a-b;
		String name = "Arjun Khadka";
		
		Arithmetic Operators
		+
		-
		/
		* 
		%	Modulus Operator	remainder
		x=10%3;		x=>1;
		
		combination operator
		when working on same operator on both sides
		x=5;	x=x+7;	===		x+=7;
		+=
		-=
		/=
		*=
		%=
		
		x=a+b;
		x=x+5;		x+=5;
		x=x/5;		x/=5;
		x=10;
		x=x%3;		x%=3;		x=>1
		
		Unary Operators
		++
		--
		x=1;
		x=x+1;			x+=1;			x++;			++x;
		x=x-1;			x-=1;			x--;			--x;
		
		x=34;
		y=x++;		y=34; x=35;			post increment		
		z=++y;		y=35; z=35;			per increment
		
		
		conditional operator	o/p	true/false
			==		equals to operator		1==1	=>true		1==2		=>false
			<	less than
			>	greater than	
			<=	lessthan or equals to
			>=	greatear than or equals to
			!=	not equals to
			
		logical operator
		OR || short circuit OR
		AND	&&	short circuit AND
		XOR	^	exclusive OR
		NOT	!
		
		A		B		A||B	A&&B	A^B
		0		0		0		0		0
		0		1		1		0		1
		1		0		1		0		1
		1		1		1		1		0
		
		A	!A
		0	1
		1	0
		
		Bitwise Operator
		complement
		left shift
		right shift
		
		
 */
