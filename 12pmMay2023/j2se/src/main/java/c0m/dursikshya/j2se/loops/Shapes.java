package c0m.dursikshya.j2se.loops;

public class Shapes {
	public static void main(String[] args) {
		int i,j;
		System.out.println("Rectangle");
		for(i=0; i<5; i++) {
			for(j=0; j<5; j++) {
				System.out.print("*  ");			
			}
			System.out.println();
		}
		
		System.out.println("Triangle 1");
		for(i=0; i<5; i++) {
			for(j=0; j<5-i; j++) {
				System.out.print("*  ");			
			}
			System.out.println();
		}
		
		System.out.println("Triangle 2");
		for(i=0; i<5; i++) {
			for(j=0; j<=i; j++) {
				System.out.print("*  ");			
			}
			System.out.println();
		}
		System.out.println("Triangle 3");
		for(i=0; i<5; i++) {
			for(j=0; j<4-i; j++) {
				System.out.print(" ");			
			}
			for(j=0; j<=i; j++) {
				System.out.print("* ");			
			}
			System.out.println();
		}
		
		System.out.println("Triangle 4");
		for(i=0; i<5; i++) {
			for(j=0; j<i; j++) {
				System.out.print("   ");			
			}
			for(j=0; j<5-i; j++) {
				System.out.print("*  ");			
			}
			System.out.println();
		}
		
		System.out.println("Pyramid");
		for(i=0; i<5; i++) {
			for(j=0; j<4-i; j++) {
				System.out.print("   ");			
			}
			for(j=0; j<=i; j++) {
				System.out.print("*  ");			
			}
			for(j=0; j<i; j++) {
				System.out.print("*  ");			
			}
			System.out.println();
		}
		
		
		
		
	}
}
