package c0m.dursikshya.j2se.functions;

public class Recursion {
	public static void main(String[] args) {
		int n=10;
		int sumOfNaturalNumbers = sum(n);
		System.out.println("Sum of Natural Numbers: "+ sumOfNaturalNumbers);
	}

	private static int sum(int n) {
		if(n==0) {
			return 0;
		}	
		return n+sum(n-1);
	}
	
}

/*
 sum(10)
 10+sum(9)
 10+9+sum(8)
 
 
 10+9+8+7+6+5+4+3+2+1+sum(0);
 55+0
 55
 
 
 
 */
