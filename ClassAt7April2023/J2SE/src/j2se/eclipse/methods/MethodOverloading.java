package j2se.eclipse.methods;

public class MethodOverloading {
	public static void main(String[] args) {
		int a=23, b=56, c=45, res;
		res = sum(a,b);
		System.out.println("sum of a and b: "+res);
		res = sum(a,b,c);
		System.out.println("sum of a, b and c: "+res);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	static int sum(int x, int y) {
		return x+y;
	}
	static int sum(int x, int y, int z) {
		return x+y+z;
	}
}
