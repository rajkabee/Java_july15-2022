package javaBasics.intro.oop.polymorphism;

public class Ncell extends Sim {

	@Override
	public void call() {
		System.out.println("Calling using NCell...");
	}

	@Override
	public void data() {
		System.out.println("surfing internet using NCell...");
	}

}
