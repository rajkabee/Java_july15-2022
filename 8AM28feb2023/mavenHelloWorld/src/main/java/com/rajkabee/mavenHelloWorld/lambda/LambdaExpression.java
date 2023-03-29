package com.rajkabee.mavenHelloWorld.lambda;
@FunctionalInterface
interface Display{
	public void print();
}

public class LambdaExpression {
	
	public static void main(String[] args) {
		String msg = "hello";
		Display d = new Display() {
			@Override
			public void print() {
				System.out.println(msg+", Mr. Jack");
			}
		};
	
//		Display d = ()->{
//			System.out.println(msg);
//		};
		d.print();
	}
	
}
