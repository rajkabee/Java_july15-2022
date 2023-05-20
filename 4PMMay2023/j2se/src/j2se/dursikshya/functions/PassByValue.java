package j2se.dursikshya.functions;

public class PassByValue {
	public static void main(String[] args) {
		int x=123;
		System.out.println("In the main function: "+x);
		increment(x);
		System.out.println("In the main function: "+x);
	}
	static void increment(int x) {
		x+=123;
		System.out.println("Increment: "+x);
	}
}
