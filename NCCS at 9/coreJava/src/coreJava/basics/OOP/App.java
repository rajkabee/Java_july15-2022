package coreJava.basics.OOP;

public class App {
	public static void main(String[] args) {
		Product p1 = new Product(3221, "fzs", "Yamaha");
		Product p2 = new Product();
		p2.id = 123;
		p2.name = "pulser";
		p2.manufacturer = "Bajaj";
		
		System.out.println(p1.details());
		System.out.println(p2.id+". "+p2.name+"\t"+p2.manufacturer);
	}
}
