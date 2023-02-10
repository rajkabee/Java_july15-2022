package javaBasics.collectionVariables.arrays;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		int x[] = {1,2,3,4,5};
		int y[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		int z[][][]= {
				{{1,2,3},{4,5,6},{7,8,9}},
				{{9,8,7},{6,5,4},{3,2,1}},
				{{8,7,6},{5,9,4},{3,5,1}}
		};
		
		int i,j,k;
		System.out.println("\nArray x[5]:");
		for(i=0; i<5; i++) {
			System.out.print(x[i]+"\t");
		}
		System.out.println("\nArray Y[3][3]:");
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				System.out.print(y[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("\nArray z[3][3][3]:");
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				for(k=0; k<3; k++) {
					System.out.print(z[i][j][k]+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
