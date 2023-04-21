package javaSE.dursikshya.example.oop.ploymorphism;

public class Ncell implements Sim{
	@Override
	public void call() {
		System.out.println("Calling using Ncell...");
	}
	
	@Override
	public void data() {
		System.out.println("Surfing Internet using Ncell...");
	}
}
