package com.examples.j2se.oop.polymorphism;

public class Ncell extends Sim {
	@Override
	public void call() {
		System.out.println("Calling using Ncell...");
	}
	@Override
	public void data() {
		System.out.println("Surfing internet using Ncell...");
	}
}
