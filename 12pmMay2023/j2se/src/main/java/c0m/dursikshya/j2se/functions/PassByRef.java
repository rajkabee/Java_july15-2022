package c0m.dursikshya.j2se.functions;

public class PassByRef {
	public static void main(String[] args) {
		int x[]= {123};
		System.out.println("x: "+x[0]);
		increment(x);
		System.out.println("x: "+x[0]);
		
	}

	private static void increment(int[] x) {
		x[0]+=200;
		System.out.println("x: "+x[0]);		
	}
}
