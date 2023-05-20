package com.examples.j2se.collections;

public class Wrappers {
	public static void main(String[] args) {
		int a=5, b=7, sum;
		sum=add(a,b);
		System.out.println("SUM: "+sum);
	}
	
	static Integer add(Integer a, Integer b) {
		Integer sum = a+b;
		return sum;
	}
}
