package j2se.dursikshya.loops;

public class Shapes {
	public static void main(String[] args) {
		int i,j;
		System.out.println("Rectangle: ");
		for(i=0; i<5; i++) {
			for(j=0; j<5; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		
		System.out.println("triangle 1: ");
		for(i=0; i<5; i++) {
			for(j=0; j<5-i; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		
		System.out.println("triangle 2: ");
		for(i=0; i<5; i++) {
			for(j=0; j<=i; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		
		System.out.println("triangle 3: ");
		for(i=0; i<5; i++) {
			for(j=0; j<4-i; j++) {
				System.out.print("   ");
			}
			for(j=0; j<=i; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		
		System.out.println("triangle 4: ");
		for(i=0; i<5; i++) {
			for(j=0; j<i; j++) {
				System.out.print("   ");
			}
			for(j=0; j<5-i; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		
		System.out.println("pyramid: ");
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
		System.out.println("diamond: ");
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
		for(i=0; i<4; i++) {
			for(j=0; j<=i; j++) {
				System.out.print("   ");
			}
			for(j=0; j<4-i; j++) {
				System.out.print("*  ");
			}
			for(j=0; j<3-i; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
	}
}
