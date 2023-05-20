package j2se.dursikshya.functions;

public class FunctionOverloading {
	public static void main(String[] args) {
		int a=5, b=7, c=3, res;
		res=add(a,b);
		System.out.println("Sum: "+res);
		res=add(a,b,c);
		System.out.println("Sum: "+res);
	}

	private static int add(int a, int b, int c) {
		return a+b+c;
	}

	private static int add(int a, int b) {
		return a+b;
	}
}
