package myFirstJavaProject.classAndObjects.polymorphism;

public class App {
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.sim.call();
		mobile.sim.data();
		
		
//		int a=4, b=3, c=7, sum1, sum2;
//		sum1=add(a,b);
//		sum2=add(a,b,c);
//		System.out.println("sum1: "+sum1);
//		System.out.println("sum2: "+sum2);
	}

	private static int add(int a, int b, int c) {
		return a+b+c;
	}

	private static int add(int a, int b) {
		return a+b;
	}
}
