package j2se.eclipse.oop.abstraction;

public class Rectangle extends Shape{

	float l,b;
	@Override
	public float area() {
		return l*b;
	}

	@Override
	public float perimeter() {
		return 2*(l+b);
	}

	public Rectangle(float l, float b) {
		super();
		this.l = l;
		this.b = b;
	}
	
	
}
