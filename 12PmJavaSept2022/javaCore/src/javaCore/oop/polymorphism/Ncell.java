package javaCore.oop.polymorphism;

public class Ncell implements Sim {
	@Override
	public void call() {
		System.out.println("Calling using ncell...");
	}
	
	@Override
	public void data() {
		System.out.println("Surfing internet using ncell...");
	}
}
