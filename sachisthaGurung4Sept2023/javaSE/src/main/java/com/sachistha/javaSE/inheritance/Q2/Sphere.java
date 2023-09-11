package com.sachistha.javaSE.inheritance.Q2;

public class Sphere extends ThreeDShape {
	@Override
	public void computeVolume() {
		System.out.println("(4/3)*pi*r^3");
	}
}
