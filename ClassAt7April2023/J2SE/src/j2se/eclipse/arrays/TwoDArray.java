package j2se.eclipse.arrays;

public class TwoDArray {
	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][] = new int[3][3];
		int sum[][]=new int[3][3];
		int i, j, k=9;
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				b[i][j]=k;
				k--;
			}
		}
		System.out.println("Array A: ");
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Array b: ");
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		
		System.out.println("Sum: ");
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
