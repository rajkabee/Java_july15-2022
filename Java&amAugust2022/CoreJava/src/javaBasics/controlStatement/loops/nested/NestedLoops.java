package javaBasics.controlStatement.loops.nested;

public class NestedLoops {
	public static void main(String[] args) {
		int i,j,k;
		for(i=1; i<=10; i++) {
			for(j=2; j<=10; j++) {
				System.out.print(j+"x"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
}
