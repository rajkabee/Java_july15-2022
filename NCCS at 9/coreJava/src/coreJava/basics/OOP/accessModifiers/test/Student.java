package coreJava.basics.OOP.accessModifiers.test;

public class Student {
	public int id;
	protected String name;
	private float percentage;
	
	
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public float getPercentage() {
		return this.percentage;
	}
	
}
