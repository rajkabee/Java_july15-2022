package com.sachistha.javaSE.inheritance.staticKeyword;

public class OuterClass {
	public int x;
	public static int y;
	public class InnerClass{
		int z;
		public int getX() {
			return x;
		}
	}
	public static class NestedClass{
		int n;
//		public int getX() {
//			return x;
//		}
	}
}
