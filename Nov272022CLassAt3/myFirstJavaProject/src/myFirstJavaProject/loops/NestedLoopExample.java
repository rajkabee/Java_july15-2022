package myFirstJavaProject.loops;

public class NestedLoopExample {
	public static void main(String[] args) {
		int i,j;
		for(i=0; i<5; i++) {
			for(j=0; j<=i; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		System.out.println();
		for(i=0; i<10; i++) {
			for(j=0; j<8; j++) {
				System.out.print(i*10+j+"  ");
			}
			System.out.println();
		}
	}
}
