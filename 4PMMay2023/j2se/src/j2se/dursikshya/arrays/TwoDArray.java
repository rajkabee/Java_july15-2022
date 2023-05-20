package j2se.dursikshya.arrays;

public class TwoDArray {
	public static void main(String[] args) {
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] b = {{9,8,7},{6,5,4},{3,2,1}};
		int[][] sum = new int[3][3];
		int i,j;
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("\t+");
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("\t=");
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}
}
