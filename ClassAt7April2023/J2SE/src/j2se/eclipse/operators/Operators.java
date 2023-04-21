package j2se.eclipse.operators;

public class Operators {
	public static void main(String[] args) {
		int x = 123%120;
		System.out.println("remainder = "+x);
		
		//unary Operators(++, --)
		x=0;
		x++;	//x=x+1;		x+=1;
		System.out.println("x = "+x);
		++x;
		System.out.println("x = "+x);
		
		x--;
		System.out.println("x = "+x);
		--x;
		System.out.println("x = "+x);
		
		
		int y = x++;		//post increment
		System.out.println("x = "+x+", y = "+y);
		
		y = ++x;			//per increment
		System.out.println("x = "+x+", y = "+y);
		
		/*
		 * combination operators
		 * 	+=
		 * 	-=
		 * 	/=
		 * 	*=
		 * 	%=
		 */
		
		x=x+45;
		System.out.println("x = "+x);
		
		x*=2;
		System.out.println("x = "+x);
		
		
		/*relational operators
		 * 	==		equals to operator
		 * 	<
		 * 	>
		 * 	<=
		 * 	>=
		 * 	!=
		 * 
		 */
		
		boolean con = x>=2;
		System.out.println("Con: "+con);
		
		/*
		 logical operators
		 
		 age>=18 and age<=35
		 AND 	&&
		 OR		||
		 NOT	!
		 
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
