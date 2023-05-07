package javaSE.dursikshya.example.lambdas;

//functional interface
interface Drawable{
	void draw();
}
//
//class DrawableImpl implements Drawable{
//
//	@Override
//	public void draw() {
//		System.out.println("Drawing...");
//		
//	}
//	
//}

public class Lambdas {
	public static void main(String[] args) {
//		DrawableImpl drawable = new DrawableImpl();
//		drawable.draw();
		
//		Drawable d = new Drawable() {
//			
//			@Override
//			public void draw() {
//				System.out.println("Drawing...");
//				
//			}
//		};
		
		Drawable d = ()->System.out.println("Drawing...");
		d.draw();
	}
}
