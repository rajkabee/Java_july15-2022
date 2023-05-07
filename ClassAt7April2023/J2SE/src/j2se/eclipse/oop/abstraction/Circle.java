package j2se.eclipse.oop.abstraction;

public class Circle extends Shape {

	float radius;
	
	@Override
	public float area() {
		return 3.1415f*radius*radius;
	}

	@Override
	public float perimeter() {
		return 2*3.1415f*radius;
	}

	

}
