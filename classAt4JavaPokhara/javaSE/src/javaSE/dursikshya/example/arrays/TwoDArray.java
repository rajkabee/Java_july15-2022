package javaSE.dursikshya.example.arrays;

public class TwoDArray {
	public static void main(String[] args) {
		//int[][] num = new int[3][3];
		int[][] num = {{1,2,3}, {4,5,6}, {7,8,9}};
//		int[][][] arr3D = {{{1,2,3}, {4,5,6}, {7,8,9}},
//						{{1,2,3}, {4,5,6}, {7,8,9}}, 
//						{{1,2,3}, {4,5,6}, {7,8,9}}};
		int j, i;
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
		
		int[][] a = {{1,2,3}, {4,5,6}, {7,8,9}};
		int[][] b = {{9,8,7}, {6,5,4}, {3,2,1}};
		int[][] sum = new int[3][3];
		
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				sum[i][j]=a[i][j]+b[i][j];
				System.out.print(sum[i][j]+"  ");
			}
			System.out.println();
		}
		
		
	}
}
