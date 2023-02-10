package coreJava.basics.OOP;

public class StaticKeyword {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		//p2.companyName = "Surya Nepal";
		System.out.println(p1.companyName);
		System.out.println(p2.companyName);
		System.out.println(Product.companyName);
	}
	
}
