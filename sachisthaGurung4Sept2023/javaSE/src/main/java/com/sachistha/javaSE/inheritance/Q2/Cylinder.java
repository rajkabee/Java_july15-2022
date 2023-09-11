package com.sachistha.javaSE.inheritance.Q2;

public class Cylinder extends ThreeDShape {
	float r, h;
	
	@Override
	public void computeVolume() {
		System.out.println("pi*r^2*h");
		System.out.println("Volume: "+3.1415f*Math.pow(r, 2)*h);
	}
}
