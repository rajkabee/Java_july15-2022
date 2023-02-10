package javaCore.oop.polymorphism;

public class Namaste implements Sim {
	@Override
	public void call() {
		System.out.println("Calling using namaste...");
	}
	
	@Override
	public void data() {
		System.out.println("Surfing internet using namaste...");
	}
}
