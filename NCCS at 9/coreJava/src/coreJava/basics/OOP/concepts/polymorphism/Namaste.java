package coreJava.basics.OOP.concepts.polymorphism;

public class Namaste implements Sim{
	@Override
	public void call() {
		System.out.println("Calling using Namaste...");
	}

	@Override
	public void data() {
		System.out.println("Surfing Internet using Namaste...");
	}

}