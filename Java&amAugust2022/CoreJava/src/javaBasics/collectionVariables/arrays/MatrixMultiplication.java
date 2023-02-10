package javaBasics.collectionVariables.arrays;

public class MatrixMultiplication {

		public static void main(String[] args) {
			int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
			int b[][] = {{9,8,7},{6,5,4},{3,2,1}};
			int p[][] = new int[3][3];
			
			int i,j,k;
			
			
			System.out.println("Array A:");
			for(i=0; i<3; i++) {
				for(j=0; j<3; j++) {
					System.out.print(a[i][j]+"\t");
				}
				System.out.println();
			}
			
			System.out.println("\nArray B:");
			for(i=0; i<3; i++) {
				for(j=0; j<3; j++) {
					System.out.print(b[i][j]+"\t");
				}
				System.out.println();
			}
			
			
			System.out.println("\nProduct Matrix:");
			for(i=0; i<3; i++) {
				for(j=0; j<3; j++) {
					p[i][j] = 0;
					for(k=0; k<3; k++) {
						p[i][j] += a[i][k]*b[k][j];
					}
					System.out.print(p[i][j]+"\t");
				}
				System.out.println();
			}
		}
}
