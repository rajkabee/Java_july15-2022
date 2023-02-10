package coreJava.basics.OOP.concepts.abstraction;

public abstract class AbstractClass {
	public abstract int abstractMethod(String x);
	
	public String greet(String name) {
		return "Hello "+name+", how are you?";
	}
}
