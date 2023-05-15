package c0m.dursikshya.j2se.arrays;

public class MatrixAddition {
	public static void main(String[] args) {
		int[][] a = {{1,2,3}, {4,5,6},{7,8,9}};
		int[][] b = {{9,8,7}, {6,5,4},{3,2,1}};
		int[][] s = new int[3][3];
		int i,j;
		
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				s[i][j] = a[i][j]+b[i][j];
			}
		}
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				System.out.print(s[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
