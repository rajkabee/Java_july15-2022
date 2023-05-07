package j2se.eclipse.oop.abstraction;

public class App {
	public static void main(String[] args) {
		Circle shape = new Circle();
		shape.radius=234f;
		System.out.println(shape.area());
		System.out.println(shape.perimeter());
		
		Rectangle rect = new Rectangle(12, 10);
		System.out.println(rect.area());
		System.out.println(rect.perimeter());
	}
}
